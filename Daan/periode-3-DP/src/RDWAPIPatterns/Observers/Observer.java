package RDWAPIPatterns.Observers;

// The interface that all observers must implement.
public interface Observer {
    // This method will be called by the subject whenever its state changes.
    void update();
}