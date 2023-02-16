package Week2.Command;

public class RDWInvoker {
    private RDWCommand command;

    public void setCommand(RDWCommand command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}