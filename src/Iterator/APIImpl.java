package Iterator;

import java.util.ArrayList;
import java.util.List;

public class APIImpl implements IteratorApi {
    private List<Vehicle> vehicles;

    public APIImpl() {
        this.vehicles = new ArrayList<>();
//        pak de bestaande autos en sla ze op onder deze this
    }

    @Override
    public Iterator getVehicles() {
        return new IteratorImpl(vehicles);
    }
}
