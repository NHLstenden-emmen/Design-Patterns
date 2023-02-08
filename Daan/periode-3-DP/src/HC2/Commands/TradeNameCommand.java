package HC2.Commands;

import java.util.HashMap;
import java.util.Map;

import static HC2.APIUrls.BASE_REPORT_URL;
import static HC2.APIUrls.buildUrl;
import static HC2.Formatter.formatNaming;
import static HC2.RDWAPIClient.getResponse;

public class TradeNameCommand implements Command {
    @Override
    public String execute(String input) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("handelsbenaming", formatNaming(input));

        String url = buildUrl(BASE_REPORT_URL ,params);

        String response = getResponse((url));
        return response;
    }
}
