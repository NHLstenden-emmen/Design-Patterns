package RDWAPIObserver;

public class LicenseObserverDemo {
    public static void main(String[] args) {
        // Create a subject.
        LicenseSubject licenseSubjectOne = new LicenseSubject();

        // Create two observers and register them with the subject.
        LicenseObserver observer1 = new LicenseObserver(licenseSubjectOne);

        // Change the license plate of the subject, triggering the observer
        licenseSubjectOne.setLicense("TRHP81");
        licenseSubjectOne.getLicensePlateData();

        /* When changed again, the observer notices and gets triggered, which can be seen by the different data retrieved
        by the returned data */
        licenseSubjectOne.setLicense("89NLBN");
        licenseSubjectOne.getLicensePlateData();
    }
}
