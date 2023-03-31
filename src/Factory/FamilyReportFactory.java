package Factory;

import Command.FirstAdmissionCommand;
import RDWReportBuilder.ReportBuilder;

import java.io.File;
import java.util.HashMap;

public class FamilyReportFactory extends ReportFactory {
    @Override
    public void CreateReport(String Input, String... optionalInputs) throws Exception {
        FirstAdmissionCommand firstAdmissionCommand = new FirstAdmissionCommand();
        HashMap<String, String> vehicleData = firstAdmissionCommand.execute(Input);

        ReportBuilder.buildFamilyReport(vehicleData);

        // Open the file
        // Navigate to the parent directory and specify the relative path of the file
        String parentDir = new File(".").getCanonicalPath();
        String relativePath = File.separator + "Reports" + File.separator + "Family_report_" + Input;
        File reportFile = new File(parentDir + File.separator + relativePath);

        // Open the file in Notepad
        Runtime.getRuntime().exec("notepad.exe " + reportFile.getAbsolutePath());
    }
}

