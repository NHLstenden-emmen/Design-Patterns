package Composite;

import java.util.ArrayList;
import java.util.List;

public class VehicleType  implements VehicleComponent {
    private List<VehicleComponent> vehicles;
    private String type;

    public VehicleType(String type) {
        this.type = type;
        vehicles = new ArrayList<>();
    }

    public void addVehicle(VehicleComponent vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public void print() {
        System.out.println("Vehicle Type: " + type);
        for (VehicleComponent vehicle : vehicles) {
            vehicle.print();
        }
    }
}
