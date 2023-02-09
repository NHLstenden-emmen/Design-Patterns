package Iterator;

public class Vehicle {
    private String licensePlate;
    private String type;

    public Vehicle(String licensePlate, String type) {
        this.licensePlate = licensePlate;
        this.type = type;
    }

    public Vehicle() {

    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getType() {
        return type;
    }
}
