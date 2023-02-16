package Week2.Facade;

import Week2.Adapter.RDWAPIAdapter;
import Week2.Adapter.RDWAPIClient;
import Week2.Iterator.SavedReportIterator;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        RDWAPIAdapter adapter = new RDWAPIAdapter();
        RDWFacade facade = new RDWFacade(new RDWAPIClient());
        String report = facade.getReport("89-NL-BN");
        String report2 = facade.getReport("75-NLX-7");
        String fileName = "report";
        String fileName2 = "report1";
        facade.saveReport(report);
        facade.saveReport(report2);
        System.out.println(report);
        System.out.println(report2);
        System.out.println("Report saved to file.");



        List<String> savedReportNames = facade.getSavedReportNames();
        int numSavedReports = 0;
        SavedReportIterator iterator = new SavedReportIterator(savedReportNames);
        while (iterator.hasNext()) {
            numSavedReports += iterator.next();
        }
        System.out.println("Number of saved reports: " + numSavedReports);
    }
}
