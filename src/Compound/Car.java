package Compound;

import java.util.ArrayList;
import java.util.List;

public class Car implements Component {
    private List<Component> components = new ArrayList<>();
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void displayInformation() {
        System.out.println("Car information: " + name);
        components.forEach(c -> c.displayInformation());
    }
}