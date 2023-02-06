package HC2;

import javax.script.ScriptException;

public class Vehicle {

    public String vehicleData;
    public Vehicle(String response) throws ScriptException {
        this.vehicleData = response;
    }

    public String getVehicleData() {
        return vehicleData;
    }

    public void setVehicleData(String vehicleData) {
        this.vehicleData = vehicleData;
    }
}
