package Facade;

public interface RDWAPI {
    Vehicle getVehicle(String licensePlate);
    Owner getOwner(int ownerId);
}
