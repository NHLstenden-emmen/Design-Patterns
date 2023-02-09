package StatePattern;

public class VehicleRegisteredState implements VehicleState {
    private Vehicle vehicle;

    public VehicleRegisteredState(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void updateStatus() {
        System.out.println("Vehicle is registered");
        vehicle.setState(vehicle.getPendingState());
    }
}
