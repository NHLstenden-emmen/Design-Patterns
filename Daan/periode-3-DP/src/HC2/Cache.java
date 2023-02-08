package HC2;

import HC2.States.State;
import HC2.States.fullState;

import java.util.HashMap;

public class Cache {
    private State state;
    // Create a cache that can store vehicle and their data
    private HashMap<String, HashMap> cache = new HashMap<>();

    // Constructor
    public Cache(State state) {
        this.state = state;
    }

    // Set the state of the cache
    public void setState(State state) {
        this.state = state;
    }

    // Add a vehicle to the cache
    public void addVehicle(String vehicle, HashMap vehicleData) {
        cache.put(vehicle, vehicleData);
        // Check if the cache is full
        if (cache.size() == 3) {
            setState(new fullState());
        }
        state.doAction();
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
