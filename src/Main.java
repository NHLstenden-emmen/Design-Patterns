import Adapter.RDWAPIAdapter;
import Adapter.RDWAPIService;
import Adapter.RDWClient;
import CommandPattern.RDWCommand;
import CommandPattern.RDWInvoker;
import CommandPattern.Command;
import Composite.RDWComposite;
import Composite.VehicleComponent;
import Composite.VehicleType;
//import Facade.*;
import Iterator.APIImpl;
import Iterator.IteratorApi;
import Iterator.Iterator;
//import Iterator.Vehicle;
import StatePattern.Vehicle;
import TemplateMethod.RDWVehicleDataFetcher;
import TemplateMethod.VehicleDataFetcher;

public class Main {

    public static void main(String[] args) {

        // ander iedee voor addapter was om de license plate elke keer te adapten maar ik denk niet dat dat een geldige use case was dus heb het anders gedaan
        var license = LicenseInformation.licenseFormatter("k6-43-pp");

        // state pattern:
//        Vehicle vehicle = new Vehicle();
//        vehicle.updateStatus();
//        vehicle.updateStatus();
//        vehicle.updateStatus();

        // Iterator ???
//        IteratorApi iteratorApi = new APIImpl();
//        Iterator iterator = iteratorApi.getVehicles();
//
//        while (iterator.hasNext()) {
//            Vehicle vehicle = iterator.next();
//            System.out.println("Vehicle: " + vehicle.getLicensePlate() + " Type: " + vehicle.getType());
//        }

        // Composite
//        RDWComposite rdwComposite = new RDWComposite();
//        VehicleType carType = new VehicleType("Car");
//        carType.addVehicle((VehicleComponent) new Vehicle(license, "Masda"));
//        carType.addVehicle((VehicleComponent) new Vehicle("GB001B", "Polo"));
//        rdwComposite.addVehicleType(carType);
//
//        VehicleType truckType = new VehicleType("vrachtwagen");
//        truckType.addVehicle((VehicleComponent) new Vehicle("XDDX48", "Light Truck"));
//        truckType.addVehicle((VehicleComponent) new Vehicle("HAHA93", "Zware Truck"));
//        rdwComposite.addVehicleType(truckType);
//
//        rdwComposite.printVehicles();

        // Template Method
//        RDWAPI rdwAPI = new RDWAPIImpl();
//        VehicleDataFetcher vehicleDataFetcher = new RDWVehicleDataFetcher((TemplateMethod.RDWAPI) rdwAPI);
//        TemplateMethod.VehicleData vehicleData = vehicleDataFetcher.fetchVehicleData(license);
//
//        System.out.println("Vehicle Info: ");
//        System.out.println("Owner Name: " + vehicleData.getOwner().getName());
//        System.out.println("Address: " + vehicleData.getOwner().getAddress());
        // Facede
//        RDWAPI rdwAPI = new RDWAPIImpl();
//        RDWFacade rdwFacade = new RDWFacade(rdwAPI);
//        VehicleData vehicleData = rdwFacade.getVehicleData(license);
//
//        Vehicle vehicle = vehicleData.getVehicle();
//        System.out.println("Vehicle owner ID: " + vehicle.getOwnerId());
//
//        Owner owner = vehicleData.getOwner();
//        System.out.println("Owner name: " + owner.getName());
//        System.out.println("Owner address: " + owner.getAddress());

        // Adapter pattern
//        RDWAPIService rdwService = new RDWAPIService();
//        RDWAPIAdapter rdwAPIAdapter = new RDWAPIAdapter(rdwService);
//        RDWClient rdwClient = new RDWClient(rdwAPIAdapter);
//
//        rdwClient.retrieveVehicleData(license);
//
//        // Command pattern
//        // the RDWCommand class implements the Command interface, which contains the method execute() that sends the API request and retrieves the response
//        Command command = new RDWCommand(license);
//        // the Invoker holds a reference to the Command object and invokes the execute() method when requested
//        RDWInvoker invoker = new RDWInvoker(command);
//        // mot het wel kunnen zien he
//        System.out.println(invoker.executeCommand());
    }

//    public void main(String[] args) {
//        List<RDWData> data = new List<RDWData>()
//
//        var license = LicenseInformation.licenseFormatter("k6-43-pp");
//        data = LicenseInformation.getLicensePlateData(license);
//
//        System.out.println(data);
//        System.out.println(data.get(0));
//
//        // factory
//        Vehicle vehicle = Factory.VehicleFactory.getVehicle(data.get(0).getVoertuigsoort());
//        assert vehicle != null;
//        vehicle.setData(data.toString());
//
//        // Decorator
//        RDWDataFilter filter = new RDWDataFilter(data);
//        List<RDWData> filteredData = filter.filter(rdwData -> rdwData.getCilinderinhoud() > 1600);
//    }
}