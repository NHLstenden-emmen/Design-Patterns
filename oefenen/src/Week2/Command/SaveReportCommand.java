package Week2.Command;

import Week2.Facade.RDWFacade;

public class SaveReportCommand implements RDWCommand {
    private final String report;
    private final RDWFacade facade;

    public SaveReportCommand(RDWFacade facade, String report) {
        this.facade = facade;
        this.report = report;
    }

    @Override
    public void execute() {
        facade.saveReport(report);
    }
}
