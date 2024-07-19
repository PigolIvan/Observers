import java.util.List;
import java.util.ArrayList;

public class WeatherStation {
    private List<Observer> observerList = new ArrayList<>();
    private int temperature;

    public int getTemperature() {return temperature;}

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public void notifyAllObservers(){
        for(Observer eachObserver : observerList){
            eachObserver.update(temperature);
        }
    }
    public void addObserver(Observer observer){observerList.add(observer);}
}
