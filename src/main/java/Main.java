import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanTemp = new Scanner(System.in);
        WeatherStation weatherStation = new WeatherStation();
        Observer DisplayPhone = new DisplayPhone();
        Observer DisplayTV = new DisplayTV();
        weatherStation.addObserver(DisplayPhone);
        weatherStation.addObserver(DisplayTV);
        System.out.println("Температура на сьогодні: ");
        double reqTemp = Double.parseDouble(scanTemp.next());
        weatherStation.setTemperature(reqTemp);
    }
}
