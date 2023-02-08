package Iterators;

import java.util.HashMap;

public class Cache {
    // Create a cache that can store vehicle and their data
    private HashMap<String, HashMap> cache = new HashMap<>();

    // Add a vehicle to the cache
    public void addVehicle(String vehicle, HashMap vehicleData) {
        cache.put(vehicle, vehicleData);
    }

    // Get a vehicle from the cache
    public HashMap getVehicle(String vehicle) {
        return cache.get(vehicle);
    }

    // Get the cache
    public HashMap getCache() {
        return cache;
    }

    // Get the size of the cache
    public int getSize() {
        return cache.size();
    }

    // Check if the cache is empty
    public boolean isEmpty() {
        return cache.isEmpty();
    }
}
