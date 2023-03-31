
import Adapter.APIAdapter;
import Factory.CompareVehicleReportFactory;
import Factory.ReportFactory;
import Factory.StandardReportFactory;
import RDWReportBuilder.ReportBuilder;

import Command.*;


import java.util.HashMap;
import java.util.Map;

import static API.APIBuilder.BASE_REPORT_URL;
import static API.APIBuilder.buildUrl;
import static API.RDWAPIClient.getResponse;

public class Main {
    public static void main(String[] args) throws Exception {
        StandardReportFactory standardReportFactory = new StandardReportFactory();
        CompareVehicleReportFactory compareVehicleReportFactory = new CompareVehicleReportFactory();

        /*  Adapter pattern. The adapter takes the json resposne, and puts each unique value in a hashmap
            this way we can use the data to look for specific terms, like the 'kenteken' and such. */

        APIAdapter apiAdapter = new APIAdapter();

        // Create a HashMap to store the API parameters
        Map<String, String> params = new HashMap<>();

        // Build the API URL to which the call will be made
        String url = buildUrl(BASE_REPORT_URL ,params);

        // Make API call
        String response = getResponse(url);


        /*  Command Pattern. Aangezien het met de API mogelijk is om op veel velden te sorteren maken wij voor
        meest gebruikte commando's. Deze bevatten niet alleen het op bouwen van de API Call, maar ook het aanroepen
        van de memento (wordt later behandeld) en het gebruiken van de adapter. */
        FirstAdmissionCommand firstAdmissionCommand = new FirstAdmissionCommand();

        LicensePlateCommand licensePlateCommand = new LicensePlateCommand();
        ReportBuilder.buildReport(licensePlateCommand.execute("TRHP81"));

        ReportBuilder.buildMileageReport(licensePlateCommand.execute("TRHP81"));
        ReportBuilder.buildComparisonReport(licensePlateCommand.execute("TRHP81"), licensePlateCommand.execute("ZJGV15"));

        ReportBuilder.buildFamilyReport(firstAdmissionCommand.execute("19980708"));

        HashMap<String, String> vehicleData = new HashMap<>();
        vehicleData = firstAdmissionCommand.execute("19980708");

        standardReportFactory.CreateReport("TRHP81");
        compareVehicleReportFactory.CreateReport("TRHP81", "ZJGV15");
    }
}



