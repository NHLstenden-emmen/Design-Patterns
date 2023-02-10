package MVC;

// Model class to represent the data
public class VehicleData {

    private String make;
    private String model;
    private String licensePlate;

    public VehicleData(String make, String model, String licensePlate) {
        this.make = make;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
