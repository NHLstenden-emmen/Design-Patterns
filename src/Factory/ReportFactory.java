package Factory;

public abstract class ReportFactory {
    public abstract void CreateReport(String Input, String... optionalInputs) throws Exception;
}
