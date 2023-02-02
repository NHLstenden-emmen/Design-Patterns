package RDWAPIPatterns;

import RDWAPIPatterns.Observers.Observer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LicenseSubject {
    // A list of all registered observers.
    private List<Observer> observers = new ArrayList<>();
    // The state of the subject.
    private String license;

    public void getLicensePlateData() {
        String data = retrieveDataFromAPI();
        System.out.println("Retrieving data from API: " + data);
    }

    protected String retrieveDataFromAPI() {
        String baseReportURL = "https://opendata.rdw.nl/resource/m9d7-ebf2.json?kenteken=" + getLicense();

        try {
            // Create a URL object from the base URL string
            URL url = new URL(baseReportURL);

            // Open an HttpURLConnection using the URL object
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            // Set the request method to GET, indicating that data is to be retrieved from the API
            con.setRequestMethod("GET");

            // Get the response code returned by the API
            int status = con.getResponseCode();

            // Create a BufferedReader to read the data returned by the API
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

            // Read each line of the data returned by the API
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                // Append each line of data to the `content` string builder
                content.append(inputLine);
            }

            // Close the BufferedReader
            in.close();

            // Return the data
            return content.toString();
        } catch (Exception e) {
            // If an exception is thrown, print the stack trace to the console
            e.printStackTrace();
        }
        return null;
    }

    // Getter for the subject's state.
    public String getLicense() {
        return license;
    }

    // Setter for the subject's state.
    public void setLicense(String license) {
        this.license = license;
        // Notify all observers when the state changes.
        notifyAllObservers();
    }

    // Adds an observer to the list of observers.
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // Notifies all observers of the subject's state change.
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}