package ObserverDesignpattern;

public interface IObservable {

    void add(IObserver iObserver);

    void remove(IObserver iObserver);

    void notifyTheUpdate();
}
