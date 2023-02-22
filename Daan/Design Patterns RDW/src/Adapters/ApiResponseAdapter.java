package Adapters;

import java.util.HashMap;
import java.util.Iterator;

public class ApiResponseAdapter {
    public ApiResponseAdapter() {
    }

    public static HashMap responseAdapter(String response) {
        response = response.substring(2, response.length() - 2);
        HashMap<String, String> vehicleData = new HashMap();
        String[] responseArray = response.split(",");
        String[] var3 = responseArray;
        int var4 = responseArray.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String data = var3[var5];
            String[] dataKeyValue = data.split(":");
            dataKeyValue[0] = dataKeyValue[0].replace("\"", "");
            vehicleData.put(dataKeyValue[0], dataKeyValue[1]);
        }

        Iterator var8 = vehicleData.keySet().iterator();

        while(var8.hasNext()) {
            String key = (String)var8.next();
            String value = (String)vehicleData.get(key);
            value = value.replace("\"", "");
            vehicleData.put(key, value);
        }

        return vehicleData;
    }
}


