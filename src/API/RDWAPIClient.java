package API;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RDWAPIClient {

    // Retrieves the response from the given URL and returns it as a String.
    public static String getResponse(String urlString) throws Exception {

        // Create a URL object and open a connection to it.
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Check the response code and throw an exception if it's not 200 (OK).
        int status = connection.getResponseCode();
        if (status != 200) {
            throw new Exception("Failed to retrieve response from URL. Response status: " + status);
        }

        // Read the response from the connection and append it to a StringBuilder.
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        // Convert the StringBuilder to a String and return it.
        return response.toString();
    }
}