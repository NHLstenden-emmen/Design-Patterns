package RDWAPIPatterns;

public class LicenseObserver implements Observer {
    // The subject being observed.
    private LicenseSubject licenseSubject ;

    // Constructor that takes in a subject and registers as its observer.
    public LicenseObserver(LicenseSubject licenseSubject) {
        this.licenseSubject = licenseSubject;
        this.licenseSubject.attach(this);
    }

    // Implements the update method of the Observer interface.
    // This method will be called whenever the subject's state changes.
    @Override
    public void update() {
        System.out.println("Observer: Subject license plate has changed to " + licenseSubject.getLicense());
    }
}
