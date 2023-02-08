package HC2;

import HC2.States.CacheStateFull;
import HC2.States.EmptyState;

import java.util.HashMap;

public class Cache {
    private EmptyState state;
    // Create a cache that can store vehicle and their data
    private HashMap<String, HashMap> cache = new HashMap<>();

    // Constructor to initialize the state
    public Cache(State state) {
        this.state = state;
    }

    // Add a vehicle to the cache
    public void addVehicle(String vehicle, HashMap vehicleData) {
        // If the cache is full, call the addVehicle method of the state
        if (cache.size() == 3) {
            state.addVehicle(vehicle, vehicleData);
        }
        // Else add the vehicle to the cache
        else {
            cache.put(vehicle, vehicleData);

            // If the cache is full, change the state to CacheStateFull
            if (cache.size() == 3) {
                setState(new CacheStateFull());
            }
        }
    }

    // change the state of the cache
    public void setState(CacheStateFull state) {
        this.state = state;
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
