package RDWReportBuilder;
import Command.FirstAdmissionCommand;

import java.util.HashMap;

public class ReportBuilder {

    public static void buildReport(HashMap<String, String> vehicleData) {
        try {
            // Build report using the retrieved data
            String pathToReportsFolder = "Reports/";
            String filename = pathToReportsFolder + "Standard_report_" + vehicleData.get("kenteken")
                    + FileBuilder.getFileExtension(vehicleData.get("kenteken"));
            FileBuilder.writeToFile(filename, vehicleData);
            System.out.println("Successfully saved data to " + filename);
        } catch (Exception e) {
            // Handle the exception
            e.printStackTrace();
        }
    }

    public static void buildFamilyReport(HashMap<String, String> vehicleDataOne) {
        FirstAdmissionCommand firstAdmissionCommand = new FirstAdmissionCommand();

        try {
            // Build report using the retrieved data
            String pathToReportsFolder = "Reports/";
            String filename = pathToReportsFolder + "Family_report_" + vehicleDataOne.get("datum_eerste_toelating")
                    + FileBuilder.getFileExtension(vehicleDataOne.get("datum_eerste_toelating"));

            int carDate = Integer.parseInt(vehicleDataOne.get("datum_eerste_toelating"));
            HashMap<String, String> vehicleDataTwo = firstAdmissionCommand.execute(Integer.toString(carDate + 1));
            HashMap<String, String> vehicleDataThree = firstAdmissionCommand.execute(Integer.toString(carDate - 1));

            String yourCar = vehicleDataOne.get("kenteken") + " Date: " + vehicleDataOne.get("datum_eerste_toelating") + " Benaming: " + vehicleDataOne.get("handelsbenaming");
            String youngerCar = vehicleDataTwo.get("kenteken") + " Date: " + vehicleDataTwo.get("datum_eerste_toelating") + " Benaming: " + vehicleDataTwo.get("handelsbenaming");
            String olderCar = vehicleDataThree.get("kenteken") + " Date: " + vehicleDataThree.get("datum_eerste_toelating") + " Benaming: " + vehicleDataThree.get("handelsbenaming");

            HashMap<String, String> vehicleFamilyData = new HashMap<>();
            vehicleFamilyData.put("Gevraagde auto: ", yourCar);
            vehicleFamilyData.put("Oudere auto: ", youngerCar);
            vehicleFamilyData.put("Jongere auto: ", olderCar);

            FileBuilder.writeToFile(filename, vehicleFamilyData);
            System.out.println("Successfully saved data to " + filename);
        }
        catch (Exception e) {
            // Handle the exception
            e.printStackTrace();
        }
    }

    public static void buildMileageReport(HashMap<String, String> vehicleData) {
        try {
            // Build report using the retrieved data
            String pathToReportsFolder = "Reports/";
            String filename = pathToReportsFolder + "Mileage_report_" + vehicleData.get("kenteken")
                    + FileBuilder.getFileExtension(vehicleData.get("kenteken"));

            String kenteken = vehicleData.get("kenteken");
            String mileageCheck = vehicleData.get("tellerstandoordeel");

            // Check if the specific car has a logical or unlogical registered mileage
            vehicleData.clear();
            vehicleData.put("Kenteken", kenteken);
            vehicleData.put("Kloppende km stand", mileageCheck);

            FileBuilder.writeToFile(filename, vehicleData);
            System.out.println("Successfully saved data to " + filename);
        }
        catch (Exception e) {
            // Handle the exception
            e.printStackTrace();
        }
    }

    public static void buildComparisonReport(HashMap<String, String> vehicleDataCarOne, HashMap<String, String> vehicleDataCarTwo) {
        try {
            // Build report using the retrieved data
            String pathToReportsFolder = "Reports/";
            String filename = pathToReportsFolder + "Comparison_report_" + vehicleDataCarOne.get("kenteken") + "_VS_"
                    + vehicleDataCarTwo.get("kenteken") + FileBuilder.getFileExtension(vehicleDataCarOne.get("kenteken"));

            String carsToBeCompared = vehicleDataCarOne.get("kenteken") + " vs " + vehicleDataCarTwo.get("kenteken");
            String brandsCompared = "Voertuig 1: " + vehicleDataCarOne.get("merk") + " vs Voertuig 2: " + vehicleDataCarTwo.get("merk");
            String firstRegisteredInTheNetherlands = "Voertuig 1: " + vehicleDataCarOne.get("datum_eerste_toelating") + " vs Voertuig 2: "
                    + vehicleDataCarTwo.get("datum_eerste_toelating");
            String engineCapacityComparison = "Voertuig 1: " + vehicleDataCarOne.get("cilinderinhoud") + " vs Voertuig 2: "
                    + vehicleDataCarTwo.get("cilinderinhoud");
            String engineCilinders = "Voertuig 1: " + vehicleDataCarOne.get("aantal_cilinders") + " vs Voertuig 2: "
                    + vehicleDataCarTwo.get("aantal_cilinders");
            String dismissedStatus = "Voertuig 1: " + vehicleDataCarOne.get("wacht_op_keuren") + " vs Voertuig 2: "
                    + vehicleDataCarTwo.get("wacht_op_keuren");

            // Compare the car on certain fields
            HashMap<String, String> vehicleComparisonData = new HashMap<>();
            vehicleComparisonData.put("Voertuigen die worden vergeleken: ", carsToBeCompared);
            vehicleComparisonData.put("Merk: ", brandsCompared);
            vehicleComparisonData.put("Eerste registratie Nederlands: ", firstRegisteredInTheNetherlands);
            vehicleComparisonData.put("Cilinder inhoud: ", engineCapacityComparison);
            vehicleComparisonData.put("Aantal cilinders: ", engineCilinders);
            vehicleComparisonData.put("Wok status: ", dismissedStatus);

            FileBuilder.writeToFile(filename, vehicleComparisonData);
            System.out.println("Successfully saved data to " + filename);
        }
        catch (Exception e) {
            // Handle the exception
            e.printStackTrace();
        }
    }
}


