package CommandPattern;

public class RDWInvoker {
    private Command command;

    public RDWInvoker(Command command) {
        this.command = command;
    }

    public String executeCommand() {
        return command.execute();
    }
}
