package Composite;

import java.util.ArrayList;
import java.util.List;

public class RDWComposite {
    private List<VehicleComponent> vehicleTypes;

    public RDWComposite() {
        vehicleTypes = new ArrayList<>();
    }

    public void addVehicleType(VehicleComponent vehicleType) {
        vehicleTypes.add(vehicleType);
    }

    public void printVehicles() {
        for (VehicleComponent vehicleType : vehicleTypes) {
            vehicleType.print();
        }
    }
}
