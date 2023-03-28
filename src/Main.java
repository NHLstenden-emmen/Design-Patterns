
import API.APIBuilder;
import Adapter.APIAdapter;
import Memento.RDWResponseCache;
import RDWReportBuilder.ReportBuilder;

import Command.*;


import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a new RDWResponseCache object
            RDWResponseCache cache = new RDWResponseCache();

            // Call the buildReport method with a license plate number and the cache
            ReportBuilder.buildReport("TRHP81", cache);
            ReportBuilder.buildReportFirstAdmission("19980708", cache);
            ReportBuilder.buildReportMerk("Mazda MX-5", cache);
            /*ReportBuilder.buildReportFirstAdmission("09-20-2021", cache);*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



