package Factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class StandardReport implements Report {
    private HashMap<String, String> vehicleData;

    public StandardReport(HashMap<String, String> vehicleData) {
        this.vehicleData = vehicleData;
    }

    public void CreateReport() {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("rapport.txt"));

            for (String key : vehicleData.keySet()) {
                String value = vehicleData.get(key);
                writer.write(key + ": " + value);
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
