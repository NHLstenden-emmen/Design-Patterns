package TemplateMethod;

import Facade.Owner;
import Facade.Vehicle;

public class VehicleData {

    private Vehicle vehicle;
    private Owner owner;

    public VehicleData(Vehicle vehicle, Owner owner) {
        this.vehicle = vehicle;
        this.owner = owner;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Owner getOwner() {
        return owner;
    }
}
