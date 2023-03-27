import Command.*;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws Exception {
        APIInvoker invoker = new APIInvoker();
        Command licensePlateCommand = new LicensePlateCommand();
        invoker.setCommand(licensePlateCommand);

        HashMap<String, String> commandResults = invoker.executeCommand("TRHP81");

        for (Map.Entry<String, String> entry : commandResults.entrySet()) {
            out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}