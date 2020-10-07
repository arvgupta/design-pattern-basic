package command;

public class Invoker {
    // has commands which we want to execute
    ICommand lightOn;
    ICommand lightOff;
    ICommand lightUp;
    ICommand lightDown;

    public Invoker(ICommand lightOn, ICommand lightOff, ICommand lightUp, ICommand lightDown) {
        this.lightOn = lightOn;
        this.lightOff = lightOff;
        this.lightUp = lightUp;
        this.lightDown = lightDown;
    }

    public void lightOn()
    {
        this.lightOn.execute();
    }

    public void lightOff()
    {
        this.lightOn.unexecute();
    }
}
