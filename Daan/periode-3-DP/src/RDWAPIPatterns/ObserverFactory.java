package RDWAPIPatterns;

// A factory that can create different type of observers
public class ObserverFactory {
    //Method that creates the observer
    public Observer getObserver(String observerType, LicenseSubject licenseSubject, CachingDecorator cachingDecorator ) {
        // Check if the String is null
        if (observerType == null)
        {
            return null;
        }
        // Compares strings to find out if they are equal, ignoring lower and upper case differences
        if (observerType.equalsIgnoreCase("LicenseObserver"))
        {
            return new LicenseObserver(licenseSubject);
        }
        else if (observerType.equalsIgnoreCase("CacheObserver"))
        {
            return new CacheObserver(cachingDecorator);
        }
        return null;
    }
}
