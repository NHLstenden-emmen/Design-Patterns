import API.APIBuilder;
import Adapter.APIAdapter;
import Memento.RDWResponseCache;
import RDWReportBuilder.ReportBuilder;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import static API.RDWAPIClient.getResponse;
import static java.lang.System.out;


public class Main {
    public static void main(String[] args) throws Exception {
            String kenteken = "TRHP81";
            RDWResponseCache cache = new RDWResponseCache();

            ReportBuilder.buildReport(kenteken, cache);
        }
    }


