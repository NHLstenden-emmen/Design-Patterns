package Adapter;

import CommandPattern.Command;
import CommandPattern.RDWCommand;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RDWAPIService {
    public void retrieveVehicleDataFromRDW(String licensePlate) {

        Command command = new RDWCommand(licensePlate);

        System.out.println("Adapted" + licensePlate);
        System.out.println(command);
    }
}
