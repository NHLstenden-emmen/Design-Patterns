package Week2.Command;

import Week2.Adapter.RDWAPIClient;
import Week2.Facade.RDWFacade;

public class Main {
    public static void main(String[] args) {
        RDWAPIClient apiClient = new RDWAPIClient();
        RDWFacade facade = new RDWFacade(apiClient);
        RDWInvoker invoker = new RDWInvoker();

        // Create a command to get a report
        RDWCommand getReportCommand = new GetReportCommand(facade, "89-NL-BN");
        invoker.setCommand(getReportCommand);
        invoker.executeCommand();

        // Create a command to save the report
        String report = "Report data";
        RDWCommand saveReportCommand = new SaveReportCommand(facade, report);
        invoker.setCommand(saveReportCommand);
        invoker.executeCommand();
    }
}
