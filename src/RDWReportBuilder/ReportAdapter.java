package RDWReportBuilder;

import java.util.HashMap;

public interface ReportAdapter {
    HashMap<String, String> adapt(String apiResponse);
}

