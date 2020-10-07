package command;

public class TestCommand {
    public static void main(String[] args) {
        Command lightOn=new Command(new Receiver());
        Invoker invoker=new Invoker(lightOn,null,null,null);
        invoker.lightOn();
        invoker.lightOff();
    }
}
