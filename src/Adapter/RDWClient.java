package Adapter;

public class RDWClient {
    private RDWAPI rdw;

    public RDWClient(RDWAPI rdw) {
        this.rdw = rdw;
    }

    public void retrieveVehicleData(String licensePlate) {
        rdw.retrieveVehicleData(licensePlate);
    }
}
