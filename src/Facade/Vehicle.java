package Facade;

public class Vehicle {
    private int ownerId;

    private String licensePlate;
    private String type;

    public Vehicle(String licensePlate, String type) {
        this.licensePlate = licensePlate;
        this.type = type;
    }

    public int getOwnerId() {
        return ownerId;
    }
}
