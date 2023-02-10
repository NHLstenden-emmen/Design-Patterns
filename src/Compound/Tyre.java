package Compound;

public class Tyre implements Component {
    private String name;

    public Tyre(String name) {
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
        System.out.println("Tyre information: " + name);
    }
}
