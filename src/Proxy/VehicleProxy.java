package Proxy;

public class VehicleProxy implements Vehicle {
    private RealVehicle realVehicle;
    private String licensePlate;

    public VehicleProxy(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void getVehicleDetails() {
        if (realVehicle == null) {
            realVehicle = new RealVehicle(licensePlate);
        }
        realVehicle.getVehicleDetails();
    }
}