package ObserverDesignpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements  IObservable{

    private int temperature=25;
    private List<IObserver> observers=new ArrayList<>();
    @Override
    public void add(IObserver iObserver) {

        observers.add(iObserver);
    }

    @Override
    public void remove(IObserver iObserver) {

        observers.remove(iObserver);
    }

    @Override
    public void notifyTheUpdate() {

        for (IObserver observer:observers
             ) {
            observer.update();
        }
    }

    public int getTemperature() {
        return this.temperature;

    }

    public void setTemperature(int temperature){
        this.temperature=temperature;
    }
}
