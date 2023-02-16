package Week1.Observer;

import java.util.ArrayList;
import java.util.List;

public class Clazz {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Object arg) {
        for (Observer observer : observers) {
            observer.update(arg);
        }
        Clazz clazz = new Clazz();
        Observer observer = new ObserverObserver();
        clazz.addObserver(observer);
        clazz.notifyObservers("hello world");
    }

}

