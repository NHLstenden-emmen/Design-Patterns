package RDWReportBuilder;
import java.util.HashMap;

public class ReportBuilder implements ReportAdapter {

    public static void buildReport(HashMap<String, String> vehicleData) {
        try {
            // Build report using the retrieved data
            String pathToReportsFolder = "Reports/";
            String filename = pathToReportsFolder + "report_" + vehicleData.get("kenteken") + ReportAdapter.getFileExtension(vehicleData.get("kenteken"));
            ReportAdapter.writeToFile(filename, vehicleData);
            System.out.println("Successfully saved data to " + filename);
        } catch (Exception e) {
            // Handle the exception
            e.printStackTrace();
        }
    }

    public static void buildReportBrand(HashMap<String, String> vehicleData) {
        try {
            // Build report using the retrieved data
            String pathToReportsFolder = "Reports/";
            String filename = pathToReportsFolder + "report_" + vehicleData.get("handelsbenaming") + ReportAdapter.getFileExtension(vehicleData.get("handelsbenaming"));
            ReportAdapter.writeToFile(filename, vehicleData);
            System.out.println("Successfully saved data to " + filename);
        }
        catch (Exception e) {
            // Handle the exception
            e.printStackTrace();
        }
    }

    public static void buildReportFirstAdmission(HashMap<String, String> vehicleData) {
        try {
            // Build report using the retrieved data
            String pathToReportsFolder = "Reports/";
            String filename = pathToReportsFolder + "report_" + vehicleData.get("datum_eerste_toelating") + ReportAdapter.getFileExtension(vehicleData.get("datum_eerste_toelating"));
            ReportAdapter.writeToFile(filename, vehicleData);
            System.out.println("Successfully saved data to " + filename);
        }
        catch (Exception e) {
            // Handle the exception
            e.printStackTrace();
        }
    }
}


