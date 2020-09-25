package observer;

public class HexaObserver implements IObserver{
    Observable observable;

    public HexaObserver(Observable observable) {
        this.observable = observable;
        this.observable.add(this);
    }

    @Override
    public void update() {
        System.out.println(Integer.toHexString(observable.getState()));
    }
}
