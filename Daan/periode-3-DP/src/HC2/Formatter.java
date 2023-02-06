package HC2;

public class Formatter {
    public static String formatLicense(String license) {
        license = license.replace(" ", "");
        license = license.replace("-", "");
        license = license.replace(".", "");
        license = license.toUpperCase();
        return license;
    }

    public static String formatDate(String date) {
        date = date.replace("-", "");
        date = date.replace(".", "");
        date = date.replace(" ", "");
        return date;
    }

    public static String formatNaming(String naming) {
        naming = naming.replace(" ", "%20");
        return naming;
    }
}
