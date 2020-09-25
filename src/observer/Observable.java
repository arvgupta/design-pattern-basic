package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Observable implements IObservable {

    private List<IObserver> observers=new ArrayList<IObserver>();
    private int state;

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer->observer.update());
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObserver();
    }
}
