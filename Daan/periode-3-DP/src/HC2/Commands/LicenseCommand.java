package HC2.Commands;

import java.util.HashMap;
import java.util.Map;

import static HC2.APIUrls.BASE_REPORT_URL;
import static HC2.APIUrls.buildUrl;
import static HC2.Formatter.formatLicense;
import static HC2.RDWAPIClient.getResponse;

public class LicenseCommand implements Command {
    @Override
    public String execute(String input) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("kenteken", formatLicense(input));

        String url = buildUrl(BASE_REPORT_URL ,params);
        System.out.println(url);

        String response = getResponse((url));
        System.out.println(response);
        return response;
    }
}
