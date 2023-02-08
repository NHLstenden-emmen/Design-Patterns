package HC2.States;

public class emptyState implements State {
    @Override
    public void doAction() {
        System.out.println("The cache is not full");
    }
}
