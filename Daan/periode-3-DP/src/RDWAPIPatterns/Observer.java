package RDWAPIPatterns;

// The interface that all observers must implement.
interface Observer {
    // This method will be called by the subject whenever its state changes.
    void update();
}