package Memento;

import java.util.HashMap;

public class RDWResponseCache {
    private final HashMap<String, Memento> cache = new HashMap<>();

    public void addResponse(String kenteken, HashMap<String, String> data) {
        Memento memento = new Memento(kenteken, data);
        cache.put(kenteken, memento);
    }

    public boolean hasResponse(String kenteken) {
        return cache.containsKey(kenteken);
    }

    public HashMap<String, String> getResponse(String kenteken) {
        Memento memento = cache.get(kenteken);
        if (memento != null) {
            return memento.getData();
        } else {
            return null;
        }
    }
}