public class Main {
    public static void main(String[] args){
        WeatherStation weatherStation = new WeatherStation();
        Observer DisplayPhone = new DisplayPhone();
        Observer DisplayTV = new DisplayTV();
        weatherStation.addObserver(DisplayPhone);
        weatherStation.addObserver(DisplayTV);
        weatherStation.setTemperature(13);
        weatherStation.notifyAllObservers();
    }
}
