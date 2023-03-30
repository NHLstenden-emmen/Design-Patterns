
import API.APIBuilder;
import Adapter.APIAdapter;
import Memento.RDWResponseCache;
import RDWReportBuilder.ReportBuilder;

import Command.*;


import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import static API.APIBuilder.BASE_REPORT_URL;
import static API.APIBuilder.buildUrl;
import static API.RDWAPIClient.getResponse;
import static Formatters.Formatter.formatLicense;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws Exception {

        /*  Adapter pattern. The adapter takes the json resposne, and puts each unique value in a hashmap
            this way we can use the data to look for specific terms, like the 'kenteken' and such. */

        APIAdapter apiAdapter = new APIAdapter();

        // Create a HashMap to store the API parameters
        Map<String, String> params = new HashMap<>();
        params.put("kenteken", formatLicense("TRHP81"));

        // Build the API URL to which the call will be made
        String url = buildUrl(BASE_REPORT_URL ,params);

        // Make API call
        String response = getResponse(url);

        // Adapt the API response to a HashMap of key-value pairs
        HashMap<String, String> vehicleData = new APIAdapter().adaptResponse(response);

        out.println("Adapter DEMO");
        out.println("Kenteken: " + vehicleData.get("kenteken"));
        out.println("vervaldatum_apk: " + vehicleData.get("vervaldatum_apk"));
        out.println("tellerstandoordeel: " + vehicleData.get("tellerstandoordeel"));
        out.println("Einde Adapter DEMO \n\n\n\n\n");

        /*  Command Pattern 

         */
    }
}



