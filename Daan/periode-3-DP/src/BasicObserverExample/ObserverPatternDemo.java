package BasicObserverExample;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Create a subject.
        Subject subjectOne = new Subject();
        Subject subjectTwo = new Subject();

        // Create two observers and register them with the subject.
        ConcreteObserver observer1 = new ConcreteObserver(subjectOne);
        ConcreteObserver observer2 = new ConcreteObserver(subjectTwo);

        // Change the state of the subject.
        subjectOne.setState(5);
        subjectTwo.setState(9);
    }
}

/* Observer explanation
- First creates a subject that needs to be observed, in this case two subjects, named one and two respectively
- Create and add the observer to those subjects
- When the setState method is called to change the value of the Subject, the observer observes the change and prints the change
 */