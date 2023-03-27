package Command;

import Adapter.APIAdapter;
import Memento.RDWResponseCache;

import java.util.HashMap;
import java.util.Map;

import static API.APIBuilder.BASE_REPORT_URL;
import static API.APIBuilder.buildUrl;
import static API.RDWAPIClient.getResponse;
import static Formatters.Formatter.formatLicense;
import static java.lang.System.out;

public class LicensePlateCommand implements Command{
    @Override
    public HashMap<String, String> execute(String input) throws Exception {

        // Create a HashMap to store the API parameters
        Map<String, String> params = new HashMap<>();
        params.put("kenteken", formatLicense(input));

        String url = buildUrl(BASE_REPORT_URL ,params);

        RDWResponseCache cache = new RDWResponseCache();
        HashMap<String, String> vehicleData = cache.getResponse(url);

        String response;
        if (vehicleData == null) {
            // Make API call and store response in cache
            response = getResponse(url);

            // Adapt the API response to a HashMap of key-value pairs
            vehicleData = new APIAdapter().adaptResponse(response);
            cache.addResponse(url, vehicleData);
        }

        for (Map.Entry<String, String> entry : vehicleData.entrySet()) {
            out.println(entry.getKey() + ": " + entry.getValue());
        }

        return vehicleData;
    }
}
