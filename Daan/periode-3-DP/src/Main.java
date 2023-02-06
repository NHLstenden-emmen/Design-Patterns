import HC2.Commands.LicenseCommand;
import HC2.Vehicle;

public class Main {
    public static void main(String[] args) throws Exception {
//        // Demo van command
//        FirstAdmissionCommand firstAdmissionCommand = new FirstAdmissionCommand();
        LicenseCommand licenseCommand = new LicenseCommand();
//        TradeNameCommand tradeNameCommand = new TradeNameCommand();

//        firstAdmissionCommand.execute("19980708");
       String response = licenseCommand.execute("89NLBN");
//        tradeNameCommand.execute("MAZDA MX-5");

        Vehicle vehicle = new Vehicle(response);
        System.out.println(vehicle.getVehicleData());
    }
}