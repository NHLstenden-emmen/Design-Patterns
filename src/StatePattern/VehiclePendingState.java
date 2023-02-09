package StatePattern;

public class VehiclePendingState implements VehicleState {
    private Vehicle vehicle;

    public VehiclePendingState(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void updateStatus() {
        System.out.println("Wacht op goedkeuring");
        vehicle.setState(vehicle.getApprovedState());
    }
}
