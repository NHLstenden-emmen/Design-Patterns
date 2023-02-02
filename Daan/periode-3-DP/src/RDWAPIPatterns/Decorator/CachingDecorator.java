package RDWAPIPatterns.Decorator;

import RDWAPIPatterns.LicenseSubject;

import java.util.HashMap;
import java.util.Map;

public class CachingDecorator extends LicenseSubject {
    private Map<String, String> cache = new HashMap<>();

    @Override
    public void getLicensePlateData() {
        // Check if the license plate data has been stored in the cache
        if (cache.containsKey(getLicense())) {
            // If the data is in the cache, retrieve it from there
            System.out.println("Retrieving data from cache: " + cache.get(getLicense()));
        } else {
            // If the data is not in the cache, retrieve it from the API and store it in the cache
            String data = retrieveDataFromAPI();
            cache.put(getLicense(), data);
            System.out.println("Retrieving data from API: " + data);
        }
    }

    public Map<String, String> getCache() {
        return cache;
    }

    public int getCacheSize() {
        return cache.size();
    }

    public void setCache(Map<String, String> cache) {
        this.cache = cache;
    }
}
