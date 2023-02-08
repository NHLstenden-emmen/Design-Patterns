package HC2.States;

import java.util.HashMap;

public class EmptyState implements NormalState {

    private HashMap<String, HashMap> cache = new HashMap<>();
    @Override
    public void addVehicle(String vehicle, HashMap vehicleData) {
        System.out.println("Cache is empty");
        // add the new vehicle to the cache
        cache.put(vehicle, vehicleData);
    }
}
