package HC2.MVC;

import HC2.Commands.FirstAdmissionCommand;
import HC2.Commands.LicenseCommand;
import HC2.Commands.TradeNameCommand;

public class Model2 {
    // Create a model that can take a license plate, handelsbenaming en datum_eerste_toelating, and retrieve info using the commands, do this in separate methods
    String licensePlateResponse;
    String tradeNameResponse;
    String firstAdmissionResponse;

    public void setLicensePlateData(String licensePlate) throws Exception {
        System.out.println("Model: setLicensePlateData");
        LicenseCommand licenseCommand = new LicenseCommand();
        String licensePlateResponse = licenseCommand.execute(licensePlate);
        this.licensePlateResponse = licensePlateResponse;
    }

    public void setTradeNameData(String tradeName) throws Exception {
        System.out.println("Model: setTradeNameData");
        TradeNameCommand tradeNameCommand = new TradeNameCommand();
        String tradeNameResponse = tradeNameCommand.execute(tradeName);
        this.tradeNameResponse = tradeNameResponse;
    }

    public void setFirstAdmissionData(String firstAdmission) throws Exception {
        System.out.println("Model: setFirstAdmissionData");
        FirstAdmissionCommand firstAdmissionCommand = new FirstAdmissionCommand();
        String firstAdmissionResponse = firstAdmissionCommand.execute(firstAdmission);
        this.firstAdmissionResponse = firstAdmissionResponse;
    }

    public String getLicensePlateResponse() {
        return licensePlateResponse;
    }

    public String getTradeNameResponse() {
        return tradeNameResponse;
    }

    public String getFirstAdmissionResponse() {
        return firstAdmissionResponse;
    }
}
