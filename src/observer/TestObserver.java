package observer;

public class TestObserver {

    public static void main(String[] args) {
        Observable observable=new Observable();
        new BinaryObserver(observable);
        new OctalObserver(observable);
        new HexaObserver(observable);

        System.out.println("setting value as 15");
        observable.setState(15);
        System.out.println("setting value as 20");
        observable.setState(20);

    }
}
