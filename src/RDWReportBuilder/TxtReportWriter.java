package RDWReportBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TxtReportWriter implements ReportAdapter {
    public void writeToFile(String filename, HashMap<String, String> vehicleData) throws IOException {
        FileWriter writer = new FileWriter("Reports/" + filename);
        for (Map.Entry<String, String> entry : vehicleData.entrySet()) {
            writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
        }
        writer.close();
        System.out.println("Successfully saved data to Reports/" + filename);
    }

}

