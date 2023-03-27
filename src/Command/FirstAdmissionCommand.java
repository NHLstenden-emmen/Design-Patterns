package Command;

import API.APIBuilder;
import Adapter.APIAdapter;
import Memento.RDWResponseCache;

import java.util.HashMap;
import java.util.Map;

import static API.APIBuilder.BASE_REPORT_URL;
import static API.APIBuilder.buildUrl;
import static API.RDWAPIClient.getResponse;
import static Formatters.Formatter.formatDate;
import static java.lang.System.out;

public class FirstAdmissionCommand implements Command {

    @Override
    public String execute(String input) throws Exception {

        // Create a HashMap to store the API parameters
        Map<String, String> params = new HashMap<>();
        params.put("datum_eerste_toelating", formatDate(input));

        String url = buildUrl(BASE_REPORT_URL ,params);

        RDWResponseCache cache = new RDWResponseCache();
        HashMap<String, String> cachedResponse = cache.getResponse(url);

        String response;
        if (cachedResponse != null) {
            // Use cached response
            response = String.valueOf(cachedResponse);
            for (Map.Entry<String, String> entry : cachedResponse.entrySet()) {
                out.println(entry.getKey() + ": " + entry.getValue());
            }
        } else {
            // Make API call and store response in cache
            response = getResponse(url);
            HashMap<String, String> vehicleData = new APIAdapter().adaptResponse(response);
            cache.addResponse(url, vehicleData);
            for (Map.Entry<String, String> entry : vehicleData.entrySet()) {
                out.println(entry.getKey() + ": " + entry.getValue());
            }
        }


        // Adapt the API response to a HashMap of key-value pairs
        HashMap<String, String> vehicleData = new APIAdapter().adaptResponse(response);

        //TODO: Put data into a report

        //TODO: Return and open report
        return response;
    }
}
