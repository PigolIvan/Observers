public class DisplayPhone implements Observer{
    public DisplayPhone() {
        this.weatherStation.addObserver(this);
    }

    @Override
    public void update(int temperature) {
        System.out.println("На телефоні температура: " + temperature);
    }
}
