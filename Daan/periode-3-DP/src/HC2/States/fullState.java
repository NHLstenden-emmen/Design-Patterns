package HC2.States;

public class fullState implements State{
    @Override
    public void doAction() {
        System.out.println("The cache is full");
    }
}
