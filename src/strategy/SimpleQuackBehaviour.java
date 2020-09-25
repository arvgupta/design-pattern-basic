package strategy;

public class SimpleQuackBehaviour implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Simple quack");
    }
}
