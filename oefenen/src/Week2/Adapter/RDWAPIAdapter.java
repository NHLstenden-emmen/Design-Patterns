package Week2.Adapter;

import java.util.HashMap;
import java.util.Map;

public class RDWAPIAdapter {
    private RDWAPIClient client;

    public RDWAPIAdapter() {
        this.client = new RDWAPIClient();
    }

    public String getReport(String licensePlate) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("kenteken", RDWAPIClient.formatLicense(licensePlate));

        String url = RDWAPIClient.buildUrl(RDWAPIClient.BASE_REPORT_URL, params);
        return client.getResponse(url);
    }
}
