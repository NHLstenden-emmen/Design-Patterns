package Formatters;

// A utility class for formatting strings.
public class Formatter {

    /* Formats a license string by removing spaces, dashes, and periods,
    and converting to uppercase. */
    public static String formatLicense(String license) {
        license = license.replace(" ", "");
        license = license.replace("-", "");
        license = license.replace(".", "");
        license = license.toUpperCase();
        return license;
    }

    // Formats a date string by removing dashes, periods, and spaces.
    public static String formatDate(String date) {
        date = date.replace("-", "");
        date = date.replace(".", "");
        date = date.replace(" ", "");
        return date;
    }

    // Formats a naming string by replacing spaces
    public static String formatNaming(String naming) {
        naming = naming.replace(" ", "%20");
        return naming;
    }
}
