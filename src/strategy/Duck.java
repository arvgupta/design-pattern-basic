package strategy;

public class Duck {
    IFlyBehaviour iFlyBehaviour;
    IQuackBehaviour iQuackBehaviour;
    IDisplayBehaviour iDisplayBehaviour;

    public Duck(IFlyBehaviour iFlyBehaviour) {
        this.iFlyBehaviour = iFlyBehaviour;
    }

    public Duck(IQuackBehaviour iQuackBehaviour) {
        this.iQuackBehaviour = iQuackBehaviour;
    }

    public Duck(IDisplayBehaviour iDisplayBehaviour) {
        this.iDisplayBehaviour = iDisplayBehaviour;
    }

    public void display()
    {
        this.iDisplayBehaviour.display();
    }

    public void fly()
    {
        this.iFlyBehaviour.fly();
    }

    public void quack()
    {
        this.iQuackBehaviour.quack();
    }

}
