package Factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class StandaardRapport implements Rapport {
    private HashMap<String, String> vehicleData;

    public StandaardRapport(HashMap<String, String> vehicleData) {
        this.vehicleData = vehicleData;
    }

    public void maakRapport() {

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
