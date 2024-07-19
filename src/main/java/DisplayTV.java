public class DisplayTV implements Observer{
    public DisplayTV() {
        this.weatherStation.addObserver(this);
    }
    @Override
    public void update(int temperature) {
        System.out.println("Температура на телевізорі: " + temperature);
    }
}
