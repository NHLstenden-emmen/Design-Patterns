package CommandPattern;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RDWCommand implements Command {
    private String licensePlate;

    public RDWCommand(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String execute() {
        StringBuilder response = new StringBuilder();
        try {
            URL url = new URL("https://opendata.rdw.nl/resource/m9d7-ebf2.json?kenteken=" + licensePlate);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            if (connection.getResponseCode() != 200) {
                throw new Exception("Failed : HTTP error code : " + connection.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String output;
            while ((output = br.readLine()) != null) {
                response.append(output);
            }

            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return response.toString();
    }
}
