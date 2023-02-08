package HC2.Adapters;

import java.util.HashMap;

public class ApiResponseAdapter {
    // Formats the response to usable  in a hashmap
    public static HashMap responseAdapter(String response) {
        //Remove the first and last two characters
        response = response.substring(2, response.length() - 2);

        // Create the hashmap
        HashMap<String, String> vehicleData = new HashMap<String, String>();

        // Split the response string into an array
        String[] responseArray = response.split(",");

        // Loop through the array and add the data to the hashmap
        for (String data : responseArray) {
            // Split the data into key and value
            String[] dataKeyValue = data.split(":");

            // Remove the quotes from the key
            dataKeyValue[0] = dataKeyValue[0].replace("\"", "");

            // Add the data to the hashmap
            vehicleData.put(dataKeyValue[0], dataKeyValue[1]);
        }

        // Make it possible to get the data by the key using a for loop
        for (String key : vehicleData.keySet()) {
            // Get the value
            String value = vehicleData.get(key);

            // Remove the quotes from the value
            value = value.replace("\"", "");

            // Add the value to the hashmap
            vehicleData.put(key, value);
        }

        // Return the hashmap
        return vehicleData;
    }
}
