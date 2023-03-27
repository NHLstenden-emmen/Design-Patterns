package RDWReportBuilder;

import Command.FirstAdmissionCommand;
import Command.LicensePlateCommand;
import Command.TradeNameCommand;
import Memento.RDWResponseCache;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class ReportBuilder {
    public static void buildReport(String licensePlate, RDWResponseCache cache) {
        Command.LicensePlateCommand command = new LicensePlateCommand();
        try {
            HashMap<String, String> vehicleData = command.execute(licensePlate);

            // Build report using the vehicleData HashMap
            // For example, you could write the data to a file:
            String filename = "report_" + licensePlate + ".txt";
            FileWriter writer = new FileWriter(filename);
            for (Map.Entry<String, String> entry : vehicleData.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
            writer.close();
            System.out.println("Successfully saved data to " + filename);

        } catch (Exception e) {
            // Handle the exception
            e.printStackTrace();
        }
    }

        public static void buildReportMerk(String tradeName, RDWResponseCache cache) {
            Command.TradeNameCommand command = new TradeNameCommand();
            try {
                HashMap<String, String> vehicleData = command.execute(tradeName);

                // Build report using the vehicleData HashMap
                // For example, you could write the data to a file:
                String filename = "report_" + tradeName + ".txt";
                FileWriter writer = new FileWriter(filename);
                for (Map.Entry<String, String> entry : vehicleData.entrySet()) {
                    writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
                }
                writer.close();
                System.out.println("Successfully saved data to " + filename);

            } catch (Exception e) {
                // Handle the exception
                e.printStackTrace();
            }
        }
    /*public static void buildReportFirstAdmission(String firstAdmission, RDWResponseCache cache) {
       Command.FirstAdmissionCommand command = new FirstAdmissionCommand();
        try {
            HashMap<String, String> vehicleData = command.execute(firstAdmission);

            // Build report using the vehicleData HashMap
            // For example, you could write the data to a file:
            String filename = "report_" + firstAdmission + ".txt";
            FileWriter writer = new FileWriter(filename);
            for (Map.Entry<String, String> entry : vehicleData.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
            writer.close();
            System.out.println("Successfully saved data to " + filename);

        } catch (Exception e) {
            // Handle the exception
            e.printStackTrace();
        }
    }*/
}


