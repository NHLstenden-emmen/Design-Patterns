package MVC;

public class VehicleController {
    private VehicleData vehicleData;
    private VehicleView vehicleView;

    public VehicleController(VehicleData vehicleData, VehicleView vehicleView) {
        this.vehicleData = vehicleData;
        this.vehicleView = vehicleView;
    }

    public void setVehicleMake(String make) {
        vehicleData.setMake(make);
    }

    public void setVehicleModel(String model) {
        vehicleData.setModel(model);
    }

    public void setVehicleLicensePlate(String licensePlate) {
        vehicleData.setLicensePlate(licensePlate);
    }

    public String getVehicleMake() {
        return vehicleData.getMake();
    }

    public String getVehicleModel() {
        return vehicleData.getModel();
    }

    public String getVehicleLicensePlate() {
        return vehicleData.getLicensePlate();
    }

    public void updateView() {
        vehicleView.displayVehicleData(vehicleData.getMake(), vehicleData.getModel(), vehicleData.getLicensePlate());
    }
}
