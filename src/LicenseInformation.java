import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class LicenseInformation {

    protected static @NotNull String licenseFormatter(String license) {
        license = license.toUpperCase();
        license = license.replaceAll("[^A-Z0-9]", "");
        return license;
    }

    protected static List<RDWData> getLicensePlateData(String license) {
        String baseReportURL = "https://opendata.rdw.nl/resource/m9d7-ebf2.json?kenteken=" + license;
        try {
            URL url = new URL(baseReportURL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            int status = con.getResponseCode();

            if (status == 200){
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();

                return RDWData.fromJson(String.valueOf(content));
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
