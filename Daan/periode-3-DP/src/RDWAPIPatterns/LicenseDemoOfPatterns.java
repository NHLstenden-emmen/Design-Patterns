package RDWAPIPatterns;

import RDWAPIPatterns.Decorator.CachingDecorator;
import RDWAPIPatterns.Observers.LicenseObserver;
import RDWAPIPatterns.Singleton.SingletonLogger;

public class LicenseDemoOfPatterns {
    public static void main(String[] args) {
        /* Demo of the observer pattern

        // Create a subject.
        LicenseSubject licenseSubjectOne = new LicenseSubject();

        // Create two observers and register them with the subject.
        LicenseObserver observer1 = new LicenseObserver(licenseSubjectOne);

        // Change the license plate of the subject, triggering the observer
        licenseSubjectOne.setLicense("TRHP81");
        licenseSubjectOne.getLicensePlateData();

        // When changed again, the observer notices and gets triggered, which can be seen by the different data retrieved
        // by the returned data
        licenseSubjectOne.setLicense("89NLBN");
        licenseSubjectOne.getLicensePlateData();

        */

        /* Demo of the decorator pattern

        // Create a subject with the decorator
        CachingDecorator licenseSubjectOne = new CachingDecorator();
        LicenseObserver observer1 = new LicenseObserver(licenseSubjectOne);

        // Call the same license plate twice, showing the decorator working
        licenseSubjectOne.setLicense("TRHP81");
        licenseSubjectOne.getLicensePlateData();
        licenseSubjectOne.getLicensePlateData();

         */

        /* Demo of the factory

        // Create a subject
        CachingDecorator licenseSubjectOne = new CachingDecorator();
        ObserverFactory observerFactory = new ObserverFactory();

        // Create two observers using the factory
        Observer observer1 = observerFactory.getObserver("LicenseObserver", licenseSubjectOne, null);
        Observer observer2 = observerFactory.getObserver("CacheObserver", null, licenseSubjectOne);

        // Change the license plate of the subject, triggering the observers
        licenseSubjectOne.setLicense("TRHP81");
        licenseSubjectOne.getLicensePlateData();
        licenseSubjectOne.getLicensePlateData();

        licenseSubjectOne.setLicense("69RGHF");
        licenseSubjectOne.getLicensePlateData();

        licenseSubjectOne.setLicense("31SXZ9");
        licenseSubjectOne.getLicensePlateData();

        licenseSubjectOne.setLicense("63HJK4");
        licenseSubjectOne.getLicensePlateData();

         */

       // Demo of the Singleton pattern

        // Create a subject
        CachingDecorator licenseSubjectOne = new CachingDecorator();
        LicenseObserver observer1 = new LicenseObserver(licenseSubjectOne);

        // use the logger to log license plate
        licenseSubjectOne.setLicense("89NLBN");
        licenseSubjectOne.getLicensePlateData(licenseSubjectOne.getLicense());

        SingletonLogger logger = SingletonLogger.getInstance();
        logger.logLicense(licenseSubjectOne.getLicense());
    }
}
