//import Facade.*;
import Compound.Car;
import Compound.Component;
import Compound.Engine;
import Compound.Tyre;
//import Iterator.Vehicle;
import MVC.VehicleController;
import MVC.VehicleData;
import MVC.VehicleView;
import Proxy.Vehicle;
import Proxy.VehicleProxy;
//import StatePattern.Vehicle;

public class Main {
    public static void main(String[] args) {
//        Model-View-Controller Pattern
        VehicleData vehicleData = new VehicleData("Ford", "Mustang", "XYZ-1234");
        VehicleView vehicleView = new VehicleView();
        VehicleController vehicleController = new VehicleController(vehicleData, vehicleView);
        System.out.println(vehicleController);

//        Compound
        Component car = new Car("Volvo");
        Component engine = new Engine("V8 Engine");
        Component tyre1 = new Tyre("Michelin");
        Component tyre2 = new Tyre("Pirelli");
        Component tyre3 = new Tyre("Bridgestone");
        Component tyre4 = new Tyre("Goodyear");
        car.add(engine);
        car.add(tyre1);
        car.add(tyre2);
        car.add(tyre3);
        car.add(tyre4);
        car.displayInformation();

//        Proxy
        Vehicle vehicle = new VehicleProxy("k6-43-pp");
        vehicle.getVehicleDetails();
    }
//    public static void main(String[] args) {
//
//        // ander iedee voor addapter was om de license plate elke keer te adapten maar ik denk niet dat dat een geldige use case was dus heb het anders gedaan
//        var license = LicenseInformation.licenseFormatter("k6-43-pp");
//
//        // state pattern:
////        Vehicle vehicle = new Vehicle();
////        vehicle.updateStatus();
////        vehicle.updateStatus();
////        vehicle.updateStatus();
//
//        // Iterator ???
////        IteratorApi iteratorApi = new APIImpl();
////        Iterator iterator = iteratorApi.getVehicles();
////
////        while (iterator.hasNext()) {
////            Vehicle vehicle = iterator.next();
////            System.out.println("Vehicle: " + vehicle.getLicensePlate() + " Type: " + vehicle.getType());
////        }
//
//        // Composite
////        RDWComposite rdwComposite = new RDWComposite();
////        VehicleType carType = new VehicleType("Car");
////        carType.addVehicle((VehicleComponent) new Vehicle(license, "Masda"));
////        carType.addVehicle((VehicleComponent) new Vehicle("GB001B", "Polo"));
////        rdwComposite.addVehicleType(carType);
////
////        VehicleType truckType = new VehicleType("vrachtwagen");
////        truckType.addVehicle((VehicleComponent) new Vehicle("XDDX48", "Light Truck"));
////        truckType.addVehicle((VehicleComponent) new Vehicle("HAHA93", "Zware Truck"));
////        rdwComposite.addVehicleType(truckType);
////
////        rdwComposite.printVehicles();
//
//        // Template Method
////        RDWAPI rdwAPI = new RDWAPIImpl();
////        VehicleDataFetcher vehicleDataFetcher = new RDWVehicleDataFetcher((TemplateMethod.RDWAPI) rdwAPI);
////        TemplateMethod.VehicleData vehicleData = vehicleDataFetcher.fetchVehicleData(license);
////
////        System.out.println("Vehicle Info: ");
////        System.out.println("Owner Name: " + vehicleData.getOwner().getName());
////        System.out.println("Address: " + vehicleData.getOwner().getAddress());
//        // Facede
////        RDWAPI rdwAPI = new RDWAPIImpl();
////        RDWFacade rdwFacade = new RDWFacade(rdwAPI);
////        VehicleData vehicleData = rdwFacade.getVehicleData(license);
////
////        Vehicle vehicle = vehicleData.getVehicle();
////        System.out.println("Vehicle owner ID: " + vehicle.getOwnerId());
////
////        Owner owner = vehicleData.getOwner();
////        System.out.println("Owner name: " + owner.getName());
////        System.out.println("Owner address: " + owner.getAddress());
//
//        // Adapter pattern
////        RDWAPIService rdwService = new RDWAPIService();
////        RDWAPIAdapter rdwAPIAdapter = new RDWAPIAdapter(rdwService);
////        RDWClient rdwClient = new RDWClient(rdwAPIAdapter);
////
////        rdwClient.retrieveVehicleData(license);
////
////        // Command pattern
////        // the RDWCommand class implements the Command interface, which contains the method execute() that sends the API request and retrieves the response
////        Command command = new RDWCommand(license);
////        // the Invoker holds a reference to the Command object and invokes the execute() method when requested
////        RDWInvoker invoker = new RDWInvoker(command);
////        // mot het wel kunnen zien he
////        System.out.println(invoker.executeCommand());
//    }

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