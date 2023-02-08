import HC2.Adapters.ApiResponseAdapter;
import HC2.Cache;
import HC2.Commands.*;
import HC2.Composites.CarComposite;
import HC2.Composites.Cylinders;
import HC2.Composites.EngineCapacity;
import HC2.Composites.Model;
import HC2.Facade.CommandFacade;
import HC2.States.*;
import HC2.Templates.*;
import Iterators.*;
import java.util.HashMap;

;

public class Main {
    public static void main(String[] args) throws Exception {
        // Demo van de command pattern
        LicenseCommand licenseCommand = new LicenseCommand();
        TradeNameCommand tradeNameCommand = new TradeNameCommand();

        // print de demo command pattern
        System.out.println(licenseCommand.execute("TRHP81"));
        System.out.println(tradeNameCommand.execute("SUPRA 3.0I TWIN TURBO AUT E2"));


        // Demo van de template pattern
        Tank tank = new Tank(true, 5, true, 100);
        tank.upShift();
        tank.downShift();
        tank.getArmorRating();

        VehicleTemplate fireTruck = new FireTruck(true, 5, 1000, true);
        fireTruck.upShift();
        fireTruck.downShift();
        ((FireTruck) fireTruck).getWaterTankCapacity();


        // Demo van de adapter pattern
        LicenseCommand licenseCommand1 = new LicenseCommand();
        String response = licenseCommand1.execute("TRHP81");
        HashMap vehicleData = ApiResponseAdapter.responseAdapter(response);

        // print de demo adapter pattern
        System.out.println(vehicleData.get("merk"));
        System.out.println(vehicleData.get("handelsbenaming"));
        System.out.println(vehicleData.get("kenteken"));

        // Demo van de facade pattern
        HashMap vehicleData1 = CommandFacade.getFormattedVehicleData("TRHP81");
        HashMap vehicleData2 = CommandFacade.getFormattedVehicleDataByTradeName("SUPRA 3.0I TWIN TURBO AUT E2");
        HashMap vehicleData3 = CommandFacade.getFormattedVehicleDataByFirstAdmission("19980708");

        // print de demo facade pattern
        System.out.println(vehicleData1.get("kenteken") + " is van het merk " + vehicleData1.get("merk"));
        System.out.println(vehicleData2.get("handelsbenaming") + " is van het merk " + vehicleData2.get("merk"));
        System.out.println(vehicleData3.get("datum_eerste_toelating") + " is van het merk " + vehicleData3.get("merk"));

        // Demo van de iterator en State pattern
        State emptyState = new emptyState();
        Cache cache = new Cache(emptyState);
        cache.addVehicle("TRHP81", vehicleData1);
        cache.addVehicle(("89NLBN"), CommandFacade.getFormattedVehicleData("89NLBN"));
        cache.addVehicle(("69RGHF"), CommandFacade.getFormattedVehicleData("69RGHF"));

        // print de demo iterator pattern
        CacheIterator cacheIterator = new CacheIterator(cache);
        while (cacheIterator.hasNext()) {
            System.out.println(cacheIterator.next().getKey());
        }

        // print de demo Composite pattern
        CarComposite carComposite = new CarComposite();
        carComposite.add(new Model());
        carComposite.add(new Cylinders());
        carComposite.add(new EngineCapacity());

        carComposite.operation();
    }
}
