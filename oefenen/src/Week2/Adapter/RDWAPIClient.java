
package Week2.Adapter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RDWAPIClient {
    public static final String BASE_REPORT_URL = "https://opendata.rdw.nl/resource/m9d7-ebf2.json";

    public static void main(String[] args) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("kenteken", formatLicense("89-NL-BN"));

        String url = buildUrl(BASE_REPORT_URL ,params);
        System.out.println(url);

        getResponse(url);
        System.out.println(getResponse(url));
    }

    public static String formatLicense(String licensePlate) {
        return licensePlate.replace("-", "");
    }

    public static String buildUrl(String baseUrl, Map<String, String> params) {
        StringBuilder urlBuilder = new StringBuilder(baseUrl);
        urlBuilder.append("?");
        for (Map.Entry<String, String> param : params.entrySet()) {
            urlBuilder.append(param.getKey());
            urlBuilder.append("=");
            urlBuilder.append(param.getValue());
            urlBuilder.append("&");
        }
        urlBuilder.deleteCharAt(urlBuilder.length() - 1);
        return urlBuilder.toString();
    }


    public static String getResponse(String urlString) throws Exception {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int status = connection.getResponseCode();
        if (status != 200) {
            throw new Exception("Failed to retrieve response from URL. Response status: " + status);
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        String responseString = response.toString();
        if (responseString.isEmpty()) {
            throw new Exception("The response from the API is empty. Check the API endpoint and make sure the license plate number is correct.");
        }

        return responseString;
    }

    public static String getReport(String licensePlate) {
        return licensePlate;
    }

}



//Abstraction: The adapter pattern provides an abstraction layer between the client and the implementation details of the RDWAPIClient class.
    // The client only needs to interact with the adapter and does not need to know the details of how the reports are retrieved.
    //
    //Separation of concerns: By using the adapter pattern, the code for retrieving the reports has been separated from the code that uses the reports.
    // This makes it easier to change the implementation of the reports retrieval without affecting the rest of the code.
    //
    //Reusability: The adapter pattern makes it easier to reuse the RDWAPIClient class in other parts of the code.
    // This saves time and effort in creating new implementations for retrieving reports.
    //
    //Loose coupling: The adapter pattern promotes loose coupling between the client and the implementation details of the RDWAPIClient class.
    // The client does not need to know the details of the implementation, which makes it easier to change the implementation without affecting the client.
    //
    //Flexibility: The adapter pattern provides a flexible way to adapt the RDWAPIClient class to the needs of different clients.
    // For example, different adapter classes could be created to adapt the RDWAPIClient class to the needs of different clients, such as web applications, mobile applications, and desktop applications.


