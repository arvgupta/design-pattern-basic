package observer;

import java.util.List;
import java.util.Observer;

public interface IObservable {

    void add(IObserver observers);
    void remove(IObserver observers);
    void notifyObserver();
}
