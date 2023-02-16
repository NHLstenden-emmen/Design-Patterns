package HC2.MVC;

public class View {
    // Create a view that can take a license plate, handelsbenaming en datum_eerste_toelating, do this in separate methods
    String licensePlate;
    String tradeName;
    String firstAdmission;

    public void takeLicensePlate(String licensePlate) {
        System.out.println("Please enter a license plate:");
        System.out.println("PLate input: " + licensePlate);

        this.licensePlate = licensePlate;
    }

    public void takeTradeName(String tradeName) {
        System.out.println("Please enter a trade name:");
        System.out.println("Trade name input: " + tradeName);

        this.tradeName = tradeName;
    }

    public void takeFirstAdmission(String firstAdmission) {
        System.out.println("Please enter a first admission date:");
        System.out.println("First admission input: " + firstAdmission);

        this.firstAdmission = firstAdmission;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getTradeName() {
        return tradeName;
    }

    public String getFirstAdmission() {
        return firstAdmission;
    }
}
