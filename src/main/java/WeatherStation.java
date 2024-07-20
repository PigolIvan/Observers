import java.util.List;
import java.util.ArrayList;

public class WeatherStation {
    private List<Observer> observerList = new ArrayList<>();
    private double temperature;

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }
    public void notifyAllObservers(){
        for(Observer eachObserver : observerList){
            eachObserver.update(temperature);
        }
    }
    public void addObserver(Observer observer){observerList.add(observer);}
}
