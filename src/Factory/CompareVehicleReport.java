package Factory;

import java.util.HashMap;

public class CompareVehicleReport implements Report {
    private HashMap<String, String> vehicleData1;
    private HashMap<String, String> vehicleData2;

    public CompareVehicleReport(HashMap<String, String> vehicleData1, HashMap<String, String> vehicleData2) {
        this.vehicleData1 = vehicleData1;
        this.vehicleData2 = vehicleData2;
    }

    @Override
    public void CreateReport() {
        StringBuilder report = new StringBuilder();
        report.append("Verschillen tussen voertuig 1 en voertuig 2:\n\n");

        for (String key : this.vehicleData1.keySet()) {
            if (!vehicleData1.get(key).equals(vehicleData2.get(key))) {
                report.append(key).append(": ").append(vehicleData1.get(key)).append(" (voertuig 1) vs ").append(vehicleData2.get(key)).append(" (voertuig 2)\n");
            }
        }

        System.out.println(report.toString());
    }
}
