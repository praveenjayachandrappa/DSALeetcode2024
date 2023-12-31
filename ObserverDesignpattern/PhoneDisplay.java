package ObserverDesignpattern;

public class PhoneDisplay implements IObserver{

    private WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation){
        this.weatherStation=weatherStation;
    }
    @Override
    public void update() {
        int temperature = weatherStation.getTemperature();
        System.out.println("Got the updated temperature from the weather " +
                "station is :"+temperature);
    }
}
