import Decorator.RDWDataFilter;
import Factory.Vehicle;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Main {

    public void main(String[] args) {

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