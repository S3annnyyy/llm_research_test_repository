// Builder for constructing complex documentation objects
class Documentation {

    private String apiEndpoint;
    private String authenticationMethod;
    private String errorHandling;

    private Documentation(DocumentationBuilder builder) {
        this.apiEndpoint = builder.apiEndpoint;
        this.authenticationMethod = builder.authenticationMethod;
        this.errorHandling = builder.errorHandling;
    }

    // Optional: Getters
    public String getApiEndpoint() {
        return apiEndpoint;
    }

    public String getAuthenticationMethod() {
        return authenticationMethod;
    }

    public String getErrorHandling() {
        return errorHandling;
    }

    @Override
    public String toString() {
        return "Documentation {" +
                "apiEndpoint='" + apiEndpoint + '\'' +
                ", authenticationMethod='" + authenticationMethod + '\'' +
                ", errorHandling='" + errorHandling + '\'' +
                '}';
    }

    // Builder class
    public static class DocumentationBuilder {

        private String apiEndpoint;
        private String authenticationMethod;
        private String errorHandling;

        // Configures API endpoint details
        public DocumentationBuilder addApiEndpoint(String endpoint) {
            this.apiEndpoint = endpoint;
            return this;
        }

        // Configures authentication method
        public DocumentationBuilder addAuthenticationMethod(String method) {
            this.authenticationMethod = method;
            return this;
        }

        // Configures error handling
        public DocumentationBuilder addErrorHandling(String error) {
            this.errorHandling = error;
            return this;
        }

        // Returns fully constructed Documentation object
        public Documentation build() {
            return new Documentation(this);
        }
    }
}
