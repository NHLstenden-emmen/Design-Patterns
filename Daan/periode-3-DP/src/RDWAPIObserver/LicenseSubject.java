package RDWAPIObserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

class LicenseSubject {
    // A list of all registered observers.
    private List<Observer> observers = new ArrayList<>();
    // The state of the subject.
    private String license;

    public void getLicensePlateData() {
        String baseReportURL = "https://opendata.rdw.nl/resource/m9d7-ebf2.json?kenteken=" + license;

        try {
            URL url = new URL(baseReportURL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            int status = con.getResponseCode();

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            System.out.println(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
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