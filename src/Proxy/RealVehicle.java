package Proxy;

public class RealVehicle implements Vehicle {
    private String licensePlate;

    public RealVehicle(String licensePlate) {
        this.licensePlate = licensePlate;
        loadVehicleFromDB();
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle Details: " + licensePlate);
    }

    private void loadVehicleFromDB() {
        System.out.println("Loading vehicle details from database for license plate: " + licensePlate);
    }
}