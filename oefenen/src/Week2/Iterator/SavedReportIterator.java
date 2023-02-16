package Week2.Iterator;
import Week2.Adapter.RDWAPIAdapter;
import Week2.Adapter.RDWAPIClient;
import Week2.Facade.RDWFacade;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public class SavedReportIterator implements Iterator<Integer> {
    private List<String> savedReportNames;
    private int index = 0;

    public SavedReportIterator(List<String> savedReportNames) {
        this.savedReportNames = savedReportNames;
    }

    @Override
    public boolean hasNext() {
        return index < savedReportNames.size();
    }

    @Override
    public Integer next() {
        int count = 0;
        String fileName = savedReportNames.get(index++);
        if (fileName.endsWith(".txt")) {
            File file = new File(fileName);
            if (file.exists()) {
                count = 1;
            }
        }
        return count;
    }

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



