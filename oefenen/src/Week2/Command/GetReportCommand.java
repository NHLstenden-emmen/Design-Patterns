package Week2.Command;

import Week2.Facade.RDWFacade;

public class GetReportCommand implements RDWCommand {
    private final String licensePlate;
    private final RDWFacade facade;

    public GetReportCommand(RDWFacade facade, String licensePlate) {
        this.facade = facade;
        this.licensePlate = licensePlate;
    }

    @Override
    public void execute() {
        String report = facade.getReport(licensePlate);
        System.out.println(report);
    }
}

