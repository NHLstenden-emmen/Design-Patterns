package Composite;

public class Vehicle implements VehicleComponent {
    private String licensePlate;
    private String type;

    public Vehicle(String licensePlate, String type) {
        this.licensePlate = licensePlate;
        this.type = type;
    }

    @Override
    public void print() {
        System.out.println("Vehicle: " + licensePlate + " Type: " + type);
    }
}