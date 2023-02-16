package HC2.MVC;

public class Controller {
    // Create a controller that can take a license plate, handelsbenaming en datum_eerste_toelating, and retrieve info using the commands, do this in separate methods
    Model2 model2;
    View view;

    public Controller(Model2 model2, View view) {
        this.model2 = model2;
        this.view = view;
    }

    public void printLicensePlateData(String licensePlate) throws Exception {
        view.takeLicensePlate(licensePlate);
        model2.setLicensePlateData(view.getLicensePlate());
        System.out.println(model2.getLicensePlateResponse());
    }

    public void printTradeNameData(String tradeName) throws Exception {
        view.takeTradeName(tradeName);
        model2.setTradeNameData(view.getTradeName());
        System.out.println(model2.getTradeNameResponse());
    }

    public void printFirstAdmissionData(String firstAdmission) throws Exception {
        view.takeFirstAdmission(firstAdmission);
        model2.setFirstAdmissionData(view.getFirstAdmission());
        System.out.println(model2.getFirstAdmissionResponse());
    }
}
