package strategy;

public class NoDisplayBehaviour implements IDisplayBehaviour {
    @Override
    public void display() {
        System.out.println("No display");
    }
}
