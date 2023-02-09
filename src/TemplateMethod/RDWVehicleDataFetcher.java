package TemplateMethod;

import Facade.Owner;
import Facade.Vehicle;

public class RDWVehicleDataFetcher extends VehicleDataFetcher {
    public RDWVehicleDataFetcher(RDWAPI rdwAPI) {
        super(rdwAPI);
    }

    @Override
    protected Vehicle getVehicle(String licensePlate) {
        return rdwAPI.getVehicle(licensePlate);
    }

    @Override
    protected Owner getOwner(int ownerId) {
        return rdwAPI.getOwner(ownerId);
    }
}
