package Compound;

public class Engine implements Component {
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void displayInformation() {
        System.out.println("Engine information: " + name);
    }
}
