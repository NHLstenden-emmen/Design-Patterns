package API;

import java.util.Map;
public class APIBuilder {

    // Base URL for the RDW Open Data API
    public static final String BASE_REPORT_URL = "https://opendata.rdw.nl/resource/m9d7-ebf2.json";

    // Parameter keys for constructing the query string
    public static final String TRADE_NAME_PARAM = "&handelsbenaming=";
    public static final String FIRST_ADMISSION_PARAM = "&datum_eerste_toelating=";
    public static final String LICENSE_PARAM = "&kenteken=";

    // Builds a URL string for querying the RDW Open Data API with the given parameters.
    public static String buildUrl(String URL, Map<String, String> params) {
        StringBuilder builder = new StringBuilder(URL);
        builder.append("?");
        for (Map.Entry<String, String> entry : params.entrySet()) {
            builder.append(entry.getKey())
                    .append("=")
                    .append(entry.getValue())
                    .append("&");
        }
        return builder.toString();
    }
}
