package Factory;

import java.util.HashMap;

public class MilageCheckReport implements Report {

    private HashMap<String, String> vehicleData;

    public MilageCheckReport(HashMap<String, String> vehicleData) {
        this.vehicleData = vehicleData;
    }

    public void CreateReport() {
//        for (String kenteken : kentekens) {
            String napStatus = vehicleData.get("tellerstandoordeel");
            String verzekerd = vehicleData.get("wam_verzekerd");

            String rapport = String.format("%s: %s (%s)\n", vehicleData.get("kenteken"), napStatus, verzekerd);

            System.out.println(rapport);
//        }
    }
}