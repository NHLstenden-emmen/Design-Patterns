package Factory;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FamilieRapport implements Rapport {

    private HashMap<String, String> vehicleDataTeMatchen;
    private HashMap<String, String> vehicleDataMatchend;
    public FamilieRapport(HashMap<String, String> vehicleData1, HashMap<String, String> vehicleData2) {
        this.vehicleDataTeMatchen = vehicleData1;
        this.vehicleDataMatchend = vehicleData2;

    }
    public void maakRapport() {
        StringBuilder report = new StringBuilder();
        report.append("Alle auto's met het zelfde kenteken als "+ vehicleDataTeMatchen.get("kenteken") +":\n\n");


        for (String key : vehicleDataTeMatchen.keySet()) {
            if (vehicleDataTeMatchen.get("handelsbenaming").equals(vehicleDataMatchend.get("handelsbenaming")) &&
                    vehicleDataTeMatchen.get("datum_eerste_toelating_dt").equals(vehicleDataMatchend.get("datum_eerste_toelating_dt"))) {
                report.append(vehicleDataMatchend.get("kenteken")+ " matched \n");
            }
        }

        System.out.println(report.toString());

    }
}