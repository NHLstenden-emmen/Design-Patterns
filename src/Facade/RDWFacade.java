package Facade;

public class RDWFacade {
    private RDWAPI rdwAPI;

    public RDWFacade(RDWAPI rdwAPI) {
        this.rdwAPI = rdwAPI;
    }

    public VehicleData getVehicleData(String licensePlate) {
        Vehicle vehicle = rdwAPI.getVehicle(licensePlate);
        Owner owner = rdwAPI.getOwner(vehicle.getOwnerId());

        return new VehicleData(vehicle, owner);
    }
}
