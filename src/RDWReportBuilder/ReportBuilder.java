package RDWReportBuilder;

import API.APIBuilder;
import Adapter.APIAdapter;
import Memento.RDWResponseCache;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import static API.RDWAPIClient.getResponse;

public class ReportBuilder {
    public static void buildReport(String kenteken, RDWResponseCache cache) throws Exception {
        HashMap<String, String> vehicleData = getVehicleData(kenteken, cache);
        String filename = "report_" + kenteken + ".txt";

        FileWriter writer = new FileWriter(filename);

        for (Map.Entry<String, String> entry : vehicleData.entrySet()) {
            writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
        }

        writer.close();
        System.out.println("Successfully saved data to " + filename);
    }

    public static HashMap<String, String> getVehicleData(String kenteken, RDWResponseCache cache) throws Exception {
        HashMap<String, String> vehicleData;

        HashMap<String, String> cachedResponse = cache.getResponse(kenteken);
        if (cachedResponse != null) {
            // Use cached response
            vehicleData = cachedResponse;
        } else {
            // Make API call and store response in cache
            Map<String, String> params = new HashMap<>();
            params.put("kenteken", kenteken);
            String url = APIBuilder.buildUrl(APIBuilder.BASE_REPORT_URL, params);
            String response = getResponse(url);
            vehicleData = new APIAdapter().adaptResponse(response);
            cache.addResponse(kenteken, vehicleData);
        }
        return vehicleData;
    }
}
