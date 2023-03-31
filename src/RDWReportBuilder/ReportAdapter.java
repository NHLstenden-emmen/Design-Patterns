package RDWReportBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public interface ReportAdapter {
    static FileWriter writeToFile(String filename, HashMap<String, String> vehicleData) throws IOException {
        FileWriter writer = new FileWriter(filename);
        for (Map.Entry<String, String> entry : vehicleData.entrySet()) {
            writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
        }
        writer.close();
        return writer;
    }

  static String getFileExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf('.');
        if (lastDotIndex == -1) {
            return ""; // no file extension found
        }
        return fileName.substring(lastDotIndex + 1).toLowerCase();
    }
}

