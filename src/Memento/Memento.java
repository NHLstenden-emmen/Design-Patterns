package Memento;

import java.util.HashMap;

public class Memento {
    private final String kenteken;
    private final HashMap<String, String> data;

    public Memento(String kenteken, HashMap<String, String> data) {
        this.kenteken = kenteken;
        this.data = data;
    }

    public String getKenteken() {
        return kenteken;
    }

    public HashMap<String, String> getData() {
        return data;
    }
}
