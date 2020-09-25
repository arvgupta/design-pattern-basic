package observer;

import java.util.Observer;

public class OctalObserver implements IObserver {
    Observable observable;

    public OctalObserver(Observable observable) {
        this.observable = observable;
        this.observable.add(this);
    }

    @Override
    public void update() {
        System.out.println(Integer.toOctalString(observable.getState()));
    }
}
