package BasicObserverExample;

import java.util.ArrayList;
import java.util.List;

// The subject class, which maintains a list of its observers and provides methods
// to add and remove observers, as well as to notify all observers when its state changes.
class Subject {
    // A list of all registered observers.
    private List<Observer> observers = new ArrayList<>();
    // The state of the subject.
    private int state;

    // Getter for the subject's state.
    public int getState() {
        return state;
    }

    // Setter for the subject's state.
    public void setState(int state) {
        this.state = state;
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