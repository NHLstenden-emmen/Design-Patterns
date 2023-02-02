package RDWAPIPatterns;

public class LicensePatternImplementations {
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

        // Demo of the decorator pattern
        // Create a subject with the CachingDecorator
        LicenseSubject licenseSubjectOne = new CachingDecorator();

        // Create two observers and register them with the subject.
        LicenseObserver observer1 = new LicenseObserver(licenseSubjectOne);

        // Change the license plate of the subject, triggering the observer
        licenseSubjectOne.setLicense("TRHP81");
        licenseSubjectOne.getLicensePlateData();

        // When the same license plate gets called again, it is retrieved from the cache
        licenseSubjectOne.getLicensePlateData();
    }
}
