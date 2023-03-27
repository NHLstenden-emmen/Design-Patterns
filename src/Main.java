import API.APIBuilder;
import Adapter.APIAdapter;

import java.util.HashMap;
import java.util.Map;

import static API.RDWAPIClient.getResponse;
import static java.lang.System.out;


public class Main {
    public static void main(String[] args) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("kenteken", "TRHP81");

        String url = APIBuilder.buildUrl(APIBuilder.BASE_REPORT_URL, params);
        out.println(url);
        String response = getResponse(url);
        out.println(response);
        HashMap<String, String> vehicleData = new APIAdapter().adaptResponse(response);
        for (Map.Entry<String, String> entry : vehicleData.entrySet()) {
            out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}