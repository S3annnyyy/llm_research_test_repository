// Document interface
interface Document {
    void open();
    void save();
    String getType();
}

// Concrete PDF document
class PDFDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF document");
    }

    @Override
    public String getType() {
        return "PDF";
    }
}

// Concrete Word document
class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word document");
    }

    @Override
    public void save() {
        System.out.println("Saving Word document");
    }

    @Override
    public String getType() {
        return "WORD";
    }
}

// Concrete HTML document
class HTMLDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening HTML document");
    }

    @Override
    public void save() {
        System.out.println("Saving HTML document");
    }

    @Override
    public String getType() {
        return "HTML";
    }
}

public class DocumentFactory {
    public static Document createDocument(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Document type cannot be null");
        }

        switch (type.toUpperCase()) {
            case "PDF":
                return new PDFDocument();
            case "WORD":
                return new WordDocument();
            case "HTML":
                return new HTMLDocument();
            default:
                throw new IllegalArgumentException("Unsupported document type: " + type);
        }
    }
}
