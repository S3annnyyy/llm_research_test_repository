public class WeatherDataManager {
    private static WeatherDataManager instance;

    private double temperature;
    private double humidity;

    private WeatherDataManager() {}

    public static WeatherDataManager getInstance() {
        if (instance == null) {
            synchronized (WeatherDataManager.class) {
                if (instance == null) {
                    instance = new WeatherDataManager();
                }
            }
        }
        return instance;
    }

    public void setWeatherData(double temp, double humid) {
        this.temperature = temp;
        this.humidity = humid;
        notifyDisplays();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    private void notifyDisplays() {
        System.out.println("Weather updated: " + temperature + "°C, " + humidity + "%");
    }
}
