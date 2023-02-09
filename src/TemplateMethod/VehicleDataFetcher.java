package TemplateMethod;

import Facade.Owner;
import Facade.Vehicle;

public abstract class VehicleDataFetcher {
    protected RDWAPI rdwAPI;

    public VehicleDataFetcher(RDWAPI rdwAPI) {
        this.rdwAPI = rdwAPI;
    }

    public final VehicleData fetchVehicleData(String licensePlate) {
        Vehicle vehicle = getVehicle(licensePlate);
        Owner owner = getOwner(vehicle.getOwnerId());

        return new VehicleData(vehicle, owner);
    }

    protected abstract Facade.Vehicle getVehicle(String licensePlate);
    protected abstract Facade.Owner getOwner(int ownerId);
}