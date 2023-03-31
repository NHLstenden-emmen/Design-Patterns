
import Adapter.APIAdapter;
import Factory.*;
import RDWReportBuilder.ReportBuilder;

import Command.*;


import java.util.HashMap;
import java.util.Map;

import static API.APIBuilder.BASE_REPORT_URL;
import static API.APIBuilder.buildUrl;
import static API.RDWAPIClient.getResponse;
import static Formatters.Formatter.formatLicense;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws Exception {
        // Can be ignored
        StandardReportFactory standardReportFactory = new StandardReportFactory();
        CompareVehicleReportFactory compareVehicleReportFactory = new CompareVehicleReportFactory();
        FamilyReportFactory familyReportFactory = new FamilyReportFactory();
        MilageCheckReportFactory milageCheckReportFactory = new MilageCheckReportFactory();


        /*  Adapter pattern. The adapter takes the json response, and puts each unique value in a hashmap
            this way we can use the data to look for specific terms, like the 'kenteken' and such. */

        APIAdapter apiAdapter = new APIAdapter();

        // Create a HashMap to store the API parameters
        Map<String, String> params = new HashMap<>();
        params.put("kenteken", formatLicense("TRHP81"));

        // Build the API URL to which the call will be made
        String url = buildUrl(BASE_REPORT_URL ,params);

        // Make API call
        String response = getResponse(url);

        // Adapt the API response to a HashMap of key-value pairs
        HashMap<String, String> vehicleData = new APIAdapter().adaptResponse(response);

        out.println("Adapter DEMO");
        out.println("Kenteken: " + vehicleData.get("kenteken"));
        out.println("vervaldatum_apk: " + vehicleData.get("vervaldatum_apk"));
        out.println("tellerstandoordeel: " + vehicleData.get("tellerstandoordeel"));
        out.println("Einde Adapter DEMO \n\n\n\n\n");


        /* Command Pattern. Since it is possible to sort on many fields with the API, we create the most commonly used
        commands. These not only include building the API call, but also calling the memento (to be discussed later)
        and using the adapter. This means we need to call way less functions than above to achieve the same result, a
        full hashmap which can search in for specific terms */

        LicensePlateCommand licensePlateCommand = new LicensePlateCommand();
        HashMap<String, String> commandDemo = licensePlateCommand.execute("TRHP81");

        out.println("Command DEMO");
        out.println("Kenteken: " + commandDemo.get("kenteken"));
        out.println("vervaldatum_apk: " + commandDemo.get("vervaldatum_apk"));
        out.println("tellerstandoordeel: " + commandDemo.get("tellerstandoordeel"));
        out.println("Einde Command DEMO \n\n\n\n\n");

        /* Memento Pattern. Since we need to make many calls to the api to retrieve license plate data. Using the memento
        allows us to 'cache' these api responses, this way we don't need to make any unneeded requests. */

        out.println("Memento DEMO");
        //HIER DE REST VAN DE DEMO
        out.println("Einde Memento DEMO \n\n\n\n\n");

        /* Factory pattern. The factory pattern can retrieve the report purely based on the input and will handle
        everything through the command. The reports are set to open automatically using notepad. If that isn't applicable
        for your use case, you can find them in the folder Reports. */
        out.println("Factory DEMO");
        standardReportFactory.CreateReport("TRHP81");
        compareVehicleReportFactory.CreateReport("TRHP81", "ZJGV15");
        familyReportFactory.CreateReport("19980708");
        milageCheckReportFactory.CreateReport("TRHP81");
        out.println("Einde Factory DEMO \n\n\n\n\n");
    }
}



