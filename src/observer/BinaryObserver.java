package observer;

public class BinaryObserver implements IObserver{

    Observable observable;

    public BinaryObserver(Observable observable) {

        this.observable = observable;
        this.observable.add(this);
    }

    @Override
    public void update() {
        System.out.println(Integer.toBinaryString(observable.getState()));
    }
}
