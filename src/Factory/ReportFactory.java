package Factory;

public abstract class ReportFactory {
    public abstract void CreateReport(String input, String... optionalInputs) throws Exception;
}
