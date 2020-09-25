package observer;

public class Observer implements IObserver {

    Observable observable = new Observable();
    @Override
    public void update() {
        observable.getState();
    }
}
