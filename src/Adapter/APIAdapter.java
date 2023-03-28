package Adapter;

import java.io.Console;
import java.util.HashMap;
import java.util.Iterator;

// Implementation of AdapterInterface that converts a JSON response into a hashmap
public class APIAdapter implements AdapterInterface {

    // Method that converts a JSON response into a hashmap
    @Override
    public HashMap<String, String> adaptResponse(String JsonResponse) {

        // Stops is response is empty (2 brackets)
        if (JsonResponse.length() <= 2)
        {
            System.out.println("Your search has zero results");
            System.exit(0); // Stop the program
        }

        // Remove the square brackets from the JSON response
        JsonResponse = JsonResponse.substring(2, JsonResponse.length() - 2);
        HashMap<String, String> vehicleData = new HashMap();

        // Split the JSON response into an array of key-value pairs
        String[] responseArray = JsonResponse.split(",");
        int responseLength = responseArray.length;

        // Iterate over each key-value pair
        for(int responseIndex = 0; responseIndex < responseLength; ++responseIndex) {
            String data = responseArray[responseIndex];

            // Split the key-value pair into its respective key and value
            String[] dataKeyValue = data.split(":");

            // Remove any quotation marks from the key
            dataKeyValue[0] = dataKeyValue[0].replace("\"", "");

            // Add the key-value pair to the hashmap
            if (dataKeyValue.length >= 2)
            {
                vehicleData.put(dataKeyValue[0], dataKeyValue[1]);
            }
        }

        Iterator keyIterator = vehicleData.keySet().iterator();

        // Iterate over each key in the hashmap
        while(keyIterator.hasNext()) {
            String key = (String)keyIterator.next();

            // Remove any quotation marks from the value associated with the key
            String value = (String)vehicleData.get(key);
            value = value.replace("\"", "");

            // Update the value in the hashmap
            vehicleData.put(key, value);
        }

        return vehicleData;
    }
}
