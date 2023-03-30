package Factory;

import java.util.HashMap;

public class FamilyReport implements Report {

    private HashMap<String, String> vehicleDataToMatch;
    private HashMap<String, String> vehicleDataMatching;
    public FamilyReport(HashMap<String, String> vehicleData1, HashMap<String, String> vehicleData2) {
        this.vehicleDataToMatch = vehicleData1;
        this.vehicleDataMatching = vehicleData2;

    }
    public void CreateReport() {
        StringBuilder report = new StringBuilder();
        report.append("Alle auto's met het zelfde kenteken als "+ vehicleDataToMatch.get("kenteken") +":\n\n");


        for (String key : vehicleDataToMatch.keySet()) {
            if (vehicleDataToMatch.get("handelsbenaming").equals(vehicleDataMatching.get("handelsbenaming")) &&
                    vehicleDataToMatch.get("datum_eerste_toelating_dt").equals(vehicleDataMatching.get("datum_eerste_toelating_dt"))) {
                report.append(vehicleDataMatching.get("kenteken")+ " matched \n");
            }
        }

        System.out.println(report.toString());
    }
}