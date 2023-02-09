package StatePattern;

public class Vehicle {
    private VehicleState pendingState;
    private VehicleState approvedState;
    private VehicleState registeredState;

    private VehicleState state;

    public Vehicle() {
        pendingState = new VehiclePendingState(this);
        approvedState = new VehicleApprovedState(this);
        registeredState = new VehicleRegisteredState(this);

        state = pendingState;
    }

    public void updateStatus() {
        state.updateStatus();
    }

    public VehicleState getPendingState() {
        return pendingState;
    }

    public VehicleState getApprovedState() {
        return approvedState;
    }

    public VehicleState getRegisteredState() {
        return registeredState;
    }

    public void setState(VehicleState state) {
        this.state = state;
    }
}
