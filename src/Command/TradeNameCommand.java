package Command;

import Adapter.APIAdapter;

import java.util.HashMap;
import java.util.Map;

import static API.APIBuilder.BASE_REPORT_URL;
import static API.APIBuilder.buildUrl;
import static API.RDWAPIClient.getResponse;
import static Formatters.Formatter.formatNaming;

public class TradeNameCommand implements Command {

    @Override
    public String execute(String input) throws Exception {

        // Create a HashMap to store the API parameters
        Map<String, String> params = new HashMap<>();
        params.put("handelsbenaming", formatNaming(input));

        String url = buildUrl(BASE_REPORT_URL ,params);

        // TODO: Check if it already exist (momento) before performing call

        String response = getResponse((url));

        // Adapt the API response to a HashMap of key-value pairs
        HashMap<String, String> vehicleData = new APIAdapter().adaptResponse(response);

        //TODO: Put data into a report

        //TODO: Return and open report
        return response;
    }
}
