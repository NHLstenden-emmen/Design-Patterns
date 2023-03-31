package Factory;

import Command.LicensePlateCommand;
import RDWReportBuilder.ReportBuilder;

import java.io.File;
import java.util.HashMap;

public class CompareVehicleReportFactory extends ReportFactory {
    @Override
    public void CreateReport(String Input, String... optionalInputs) throws Exception {
        LicensePlateCommand licensePlateCommand = new LicensePlateCommand();
        LicensePlateCommand licensePlateCommandTwo = new LicensePlateCommand();
        HashMap<String, String> vehicleData = licensePlateCommand.execute(Input);
        HashMap<String, String> vehicleDataTwo = licensePlateCommandTwo.execute(optionalInputs[0]);

        ReportBuilder.buildComparisonReport(vehicleData, vehicleDataTwo);

        // Open the file
        // Navigate to the parent directory and specify the relative path of the file
        String parentDir = new File(".").getCanonicalPath();
        String relativePath = File.separator + "Reports" + File.separator + "Comparison_report_" + Input + "_VS_" + optionalInputs[0];
        File reportFile = new File(parentDir + File.separator + relativePath);

        // Open the file in Notepad
        Runtime.getRuntime().exec("notepad.exe " + reportFile.getAbsolutePath());
    }
}
