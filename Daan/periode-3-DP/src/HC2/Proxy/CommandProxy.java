package HC2.Proxy;

import HC2.Commands.Command;
import HC2.Commands.LicenseCommand;

import java.util.HashMap;
import java.util.Map;

import static HC2.APIUrls.BASE_REPORT_URL;
import static HC2.APIUrls.buildUrl;
import static HC2.Formatter.formatLicense;
import static HC2.RDWAPIClient.getResponse;

public class CommandProxy implements Command {
    private Command LicenseCommand = new LicenseCommand();

    @Override
    public String execute(String input) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("kenteken", formatLicense(input));

        String url = buildUrl(BASE_REPORT_URL ,params);

        String response = getResponse((url));

        System.out.println("Proxy: " + response);
        System.out.println("Proxy used");
        return response;
    }
}

