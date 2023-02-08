package HC2.Facade;

import HC2.Adapters.ApiResponseAdapter;
import HC2.Commands.*;
import HC2.Formatter;

import java.util.HashMap;

public class CommandFacade {
    // A facade class that functions as an interface between the adapter and command class using the LicenseCommand
    public static HashMap getFormattedVehicleData(String license) throws Exception {
        // Format the license
        license = Formatter.formatLicense(license);

        // Create the license command
        LicenseCommand licenseCommand = new LicenseCommand();

        // Execute the license command and get the response
        String response = licenseCommand.execute(license);

        // Format the response
        HashMap vehicleData = ApiResponseAdapter.responseAdapter(response);

        // Return the vehicle data
        return vehicleData;
    }

    // A facade class that functions as an interface between the adapter and command class using the TradeNameCommand
    public static HashMap getFormattedVehicleDataByTradeName(String tradeName) throws Exception {
        // Format the trade name
        tradeName = Formatter.formatNaming(tradeName);

        // Create the trade name command
        TradeNameCommand tradeNameCommand = new TradeNameCommand();

        // Execute the trade name command and get the response
        String response = tradeNameCommand.execute(tradeName);

        // Limit the response to the first vehicle (because of size)
        response = response.substring(0, response.indexOf("}"));

        // Format the response
        HashMap vehicleData = ApiResponseAdapter.responseAdapter(response);

        // Return the vehicle data
        return vehicleData;
    }

    // A facade class that functions as an interface between the adapter and command class using the FirstAdmissionCommand
    public static HashMap getFormattedVehicleDataByFirstAdmission(String firstAdmission) throws Exception {
        // Format the first admission
        firstAdmission = Formatter.formatDate(firstAdmission);

        // Create the first admission command
        FirstAdmissionCommand firstAdmissionCommand = new FirstAdmissionCommand();

        // Execute the first admission command and get the response
        String response = firstAdmissionCommand.execute(firstAdmission);

        // Limit the response to the first vehicle (because of size)
        response = response.substring(0, response.indexOf("}"));

        // Format the response
        HashMap vehicleData = ApiResponseAdapter.responseAdapter(response);

        // Return the vehicle data
        return vehicleData;
    }
}
