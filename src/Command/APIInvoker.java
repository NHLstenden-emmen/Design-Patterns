package Command;

import java.util.HashMap;

/**
 * This class acts as the invoker for the Commands.
 * Provides a method to execute the Command object's execute method.
 */
public class APIInvoker {
    private Command command;

    // Sets the Command object that will be executed when the executeCommand method is called.
    public void setCommand(Command command) {
        this.command = command;
    }

    // Executes the execute method of the Command object with the given input.
    public HashMap<String, String> executeCommand(String input) throws Exception {
        return command.execute(input);
    }
}