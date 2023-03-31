package RDWReportBuilder;

import Command.FirstAdmissionCommand;
import Command.LicensePlateCommand;
import Command.TradeNameCommand;
import Memento.RDWResponseCache;

import java.util.HashMap;

public class ReportBuilder implements ReportAdapter {

    public static void buildReport(String licensePlate, RDWResponseCache cache) {
        if (cache.hasResponse(licensePlate)) {
            // Retrieve data from cache
            HashMap<String, String> vehicleData = cache.getResponse(licensePlate);
            // Build report using the retrieved data
            String pathToReportsFolder = "Reports/";
            String filename = pathToReportsFolder + "report_" + licensePlate + ReportAdapter.getFileExtension(licensePlate);
            System.out.println("Successfully saved data to " + filename);
        } else {
            // Data not in cache, make API request
            Command.LicensePlateCommand command = new LicensePlateCommand();
            try {
                HashMap<String, String> vehicleData = command.execute(licensePlate);
                // Add data to cache
                cache.addResponse(licensePlate, vehicleData);
                // Build report using the retrieved data
                String pathToReportsFolder = "Reports/";
                String filename = pathToReportsFolder + "report_" + licensePlate + ReportAdapter.getFileExtension(licensePlate);
                ReportAdapter.writeToFile(filename, vehicleData);
                System.out.println("Successfully saved data to " + filename);
            } catch (Exception e) {
                // Handle the exception
                e.printStackTrace();
            }
        }
    }
    public static void buildReportBrand(String tradeName, RDWResponseCache cache) {
        if (cache.hasResponse(tradeName)) {
            // Retrieve data from cache
            HashMap<String, String> vehicleData = cache.getResponse(tradeName);
            // Build report using the retrieved data
            String pathToReportsFolder = "Reports/";
            String filename = pathToReportsFolder + "report_" + tradeName + ReportAdapter.getFileExtension(tradeName);
            System.out.println("Successfully saved data to " + filename);
        } else {
            // Data not in cache, make API request
            Command.TradeNameCommand command = new TradeNameCommand();
            try {
                HashMap<String, String> vehicleData = command.execute(tradeName);
                // Add data to cache
                cache.addResponse(tradeName, vehicleData);
                // Build report using the retrieved data
                String pathToReportsFolder = "Reports/";
                String filename = pathToReportsFolder + "report_" + tradeName + ReportAdapter.getFileExtension(tradeName);
                ReportAdapter.writeToFile(filename, vehicleData);
                System.out.println("Successfully saved data to " + filename);
            } catch (Exception e) {
                // Handle the exception
                e.printStackTrace();
            }
        }
    }

    public static void buildReportFirstAdmission(String firstAdmission, RDWResponseCache cache) {
        if (cache.hasResponse(firstAdmission)) {
            // Retrieve data from cache
            HashMap<String, String> vehicleData = cache.getResponse(firstAdmission);
            // Build report using the retrieved data
            String pathToReportsFolder = "Reports/";
            String filename = pathToReportsFolder + "report_" + firstAdmission + ReportAdapter.getFileExtension(firstAdmission);
            System.out.println("Successfully saved data to " + filename);
        } else {
            // Data not in cache, make API request
            Command.FirstAdmissionCommand command = new FirstAdmissionCommand();
            try {
                HashMap<String, String> vehicleData = command.execute(firstAdmission);
                // Add data to cache
                cache.addResponse(firstAdmission, vehicleData);
                // Build report using the retrieved data
                String pathToReportsFolder = "Reports/";
                String filename = pathToReportsFolder + "report_" + firstAdmission + ReportAdapter.getFileExtension(firstAdmission);
                ReportAdapter.writeToFile(filename, vehicleData);
                System.out.println("Successfully saved data to " + filename);
            } catch (Exception e) {
                // Handle the exception
                e.printStackTrace();
            }
        }
    }
}


