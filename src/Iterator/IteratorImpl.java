package Iterator;

import java.util.List;

public class IteratorImpl implements Iterator {
    private List<Vehicle> vehicles;
    private int index;

    public IteratorImpl(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < vehicles.size();
    }

    @Override
    public Vehicle next() {
        return vehicles.get(index++);
    }
}