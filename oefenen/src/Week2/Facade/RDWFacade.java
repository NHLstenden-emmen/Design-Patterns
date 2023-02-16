package Week2.Facade;

import Week2.Adapter.RDWAPIClient;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RDWFacade {

        private RDWAPIClient apiClient;

        public RDWFacade(RDWAPIClient apiClient) {
            this.apiClient = apiClient;
        }

        public String getReport(String licensePlate) {
            return RDWAPIClient.getReport(licensePlate);
        }


        public void saveReport(String report) {
            try (FileWriter fileWriter = new FileWriter(   ".txt")) {
                fileWriter.write(report);
            } catch (IOException e) {
                System.err.println("An error occurred while saving the report: " + e.getMessage());
            }
        }

    public List<String> getSavedReportNames() {
        List<String> reportNames = new ArrayList<>();
        File[] files = new File(".").listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                reportNames.add(file.getName());
            }
        }
        return reportNames;
    }

}

