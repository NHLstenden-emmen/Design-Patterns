package StatePattern;

public class VehicleApprovedState implements VehicleState {
    private Vehicle vehicle;

    public VehicleApprovedState(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void updateStatus() {
        System.out.println("Vehicle is goedgekeurd");
        vehicle.setState(vehicle.getRegisteredState());
    }
}
