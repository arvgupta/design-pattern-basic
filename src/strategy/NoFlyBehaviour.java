package strategy;

public class NoFlyBehaviour implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("No fly");
    }
}
