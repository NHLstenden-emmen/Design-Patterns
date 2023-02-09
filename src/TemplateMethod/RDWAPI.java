package TemplateMethod;

import Facade.Owner;
import Facade.Vehicle;

public interface RDWAPI {
    Vehicle getVehicle(String licensePlate);
    Owner getOwner(int ownerId);
}