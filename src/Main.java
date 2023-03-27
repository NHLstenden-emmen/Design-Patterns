import API.APIBuilder;
import Adapter.APIAdapter;
import Memento.RDWResponseCache;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import static API.RDWAPIClient.getResponse;
import static java.lang.System.out;


public class Main {
    public static void main(String[] args) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("kenteken", "TRHP81");

        String kenteken = params.get("kenteken");

        RDWResponseCache cache = new RDWResponseCache();
        HashMap<String, String> cachedResponse = cache.getResponse(kenteken);

        String filename = kenteken; // set desired filename here

        FileWriter writer = new FileWriter(filename);

        if (cachedResponse != null) {
            // Use cached response
            for (Map.Entry<String, String> entry : cachedResponse.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } else {
            // Make API call and store response in cache
            String url = APIBuilder.buildUrl(APIBuilder.BASE_REPORT_URL, params);
            String response = getResponse(url);
            HashMap<String, String> vehicleData = new APIAdapter().adaptResponse(response);
            cache.addResponse(kenteken, vehicleData);
            for (Map.Entry<String, String> entry : vehicleData.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        }

        writer.close();
        System.out.println("Successfully saved data to " + filename);
    }
}

