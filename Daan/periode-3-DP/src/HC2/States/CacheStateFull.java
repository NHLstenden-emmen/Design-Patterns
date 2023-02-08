package HC2.States;

import java.util.HashMap;

public class CacheStateFull implements NormalState{
    private HashMap<String, HashMap> cache = new HashMap<>();
    @Override
    public void addVehicle(String vehicle, HashMap vehicleData) {
        System.out.println("Cache is full");
        // remove the oldest vehicle from the cache
        cache.remove(cache.keySet().toArray()[0]);
        // add the new vehicle to the cache
        cache.put(vehicle, vehicleData);
    }
}
