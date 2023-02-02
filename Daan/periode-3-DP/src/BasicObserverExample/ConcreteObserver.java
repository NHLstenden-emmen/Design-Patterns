package BasicObserverExample;

// A concrete implementation of an observer.
class ConcreteObserver implements Observer {
    // The subject being observed.
    private Subject subject;

    // Constructor that takes in a subject and registers as its observer.
    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    // Implements the update method of the Observer interface.
    // This method will be called whenever the subject's state changes.
    @Override
    public void update() {
        System.out.println("Observer: Subject state has changed to " + subject.getState());
    }
}
