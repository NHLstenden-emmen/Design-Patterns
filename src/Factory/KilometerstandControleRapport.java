package Factory;

import java.util.HashMap;

public class KilometerstandControleRapport  implements Rapport {

    private HashMap<String, String> vehicleData;

    public KilometerstandControleRapport(HashMap<String, String> vehicleData) {
        this.vehicleData = vehicleData;
    }

    public void maakRapport() {
//        for (String kenteken : kentekens) {
            String napStatus = vehicleData.get("tellerstandoordeel");
            String verzekerd = vehicleData.get("wam_verzekerd");

            String rapport = String.format("%s: %s (%s)\n", vehicleData.get("kenteken"), napStatus, verzekerd);

            System.out.println(rapport);
//        }

    }
}