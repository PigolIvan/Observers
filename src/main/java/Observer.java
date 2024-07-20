public interface Observer {
    WeatherStation weatherStation = new WeatherStation();
    void update(double temperature);
}
