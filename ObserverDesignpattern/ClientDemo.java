package ObserverDesignpattern;

public class ClientDemo {

    public static void main(String[] args) {

        WeatherStation weatherStation=new WeatherStation();

        PhoneDisplay phoneDisplay=new PhoneDisplay(weatherStation); //observable reference is being passeed

        weatherStation.add(phoneDisplay);

        weatherStation.notifyTheUpdate();

        weatherStation.setTemperature(30);

        weatherStation.notifyTheUpdate();

    }
}
