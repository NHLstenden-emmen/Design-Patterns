package Factory;

import Command.LicensePlateCommand;
import RDWReportBuilder.ReportBuilder;

import java.io.File;
import java.util.HashMap;

public class StandardReportFactory extends ReportFactory {
    @Override
    public void CreateReport(String Input, String... optionalInputs) throws Exception {
        LicensePlateCommand licensePlateCommand = new LicensePlateCommand();
        HashMap<String, String> vehicleData = licensePlateCommand.execute(Input);

        ReportBuilder.buildReport(vehicleData);

        // Open the file
        // Navigate to the parent directory and specify the relative path of the file
        String parentDir = new File(".").getCanonicalPath();
        String relativePath = File.separator + "Reports" + File.separator + "Standard_report_" + Input;
        File reportFile = new File(parentDir + File.separator + relativePath);

        // Open the file in Notepad
        Runtime.getRuntime().exec("notepad.exe " + reportFile.getAbsolutePath());
    }
}
