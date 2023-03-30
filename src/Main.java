
import API.APIBuilder;
import Adapter.APIAdapter;
import Memento.RDWResponseCache;
import RDWReportBuilder.ReportAdapter;
import RDWReportBuilder.ReportBuilder;

import Command.*;
import RDWReportBuilder.TxtReportWriter;


import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import static API.APIBuilder.BASE_REPORT_URL;
import static API.APIBuilder.buildUrl;
import static API.RDWAPIClient.getResponse;
import static Formatters.Formatter.formatLicense;
import static RDWReportBuilder.ReportBuilder.buildReport;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws Exception {

        /*  Adapter pattern. The adapter takes the json resposne, and puts each unique value in a hashmap
            this way we can use the data to look for specific terms, like the 'kenteken' and such. */

        APIAdapter apiAdapter = new APIAdapter();

        // Create a HashMap to store the API parameters
        Map<String, String> params = new HashMap<>();

        // Build the API URL to which the call will be made
        String url = buildUrl(BASE_REPORT_URL ,params);

        // Make API call
        String response = getResponse(url);

        // Adapt the API response to a HashMap of key-value pairs
        HashMap<String, String> vehicleData = new APIAdapter().adaptResponse(response);
        RDWResponseCache cache = new RDWResponseCache();
        String licensePlate = "TRHP81";
        buildReport(licensePlate, cache);
        // Call the buildReport method with appropriate arguments



        /*  Command Pattern. Aangezien het met de API mogelijk is om op veel velden te sorteren maken wij voor
        meest gebruikte commando's. Deze bevatten niet alleen het op bouwen van de API Call, maar ook het aanroepen
        van de memento (wordt later behandeld) en het gebruiken van de adapter. */


    }
}



