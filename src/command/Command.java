package command;

public class Command implements ICommand {

    Receiver receiver=null;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.on();
    }

    @Override
    public void unexecute() {
        this.receiver.off();
    }
}
