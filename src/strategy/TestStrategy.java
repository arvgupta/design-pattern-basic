package strategy;

public class TestStrategy {

    /*
     Define a family of algorithms, encapsulate each one, and make them interchangeable.
     */
    public static void main(String[] args) {
        Duck simpleFly=new Duck(new SimpleFlyBehaviour());
        simpleFly.fly();

        Duck noFly=new Duck(new NoFlyBehaviour());
        noFly.fly();

        Duck simpleQuack=new Duck(new SimpleQuackBehaviour());
        simpleQuack.quack();
    }

}
