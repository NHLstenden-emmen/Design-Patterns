package Adapter;

public class RDWAPIAdapter implements RDWAPI {
    private RDWAPIService rdwService;

    public RDWAPIAdapter(RDWAPIService rdwService) {
        this.rdwService = rdwService;
    }

    @Override
    public void retrieveVehicleData(String licensePlate) {
        rdwService.retrieveVehicleDataFromRDW(licensePlate);
    }
}
