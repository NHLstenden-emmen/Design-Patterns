package Week2.Template;

public abstract class CarTemplate {
    protected String make;
    protected String model;
    protected int horsepower;
    protected int torque;
    protected int topSpeed;
    protected int acceleration;

    public CarTemplate(String make, String model, int horsepower, int torque, int topSpeed, int acceleration) {
        this.make = make;
        this.model = model;
        this.horsepower = horsepower;
        this.torque = torque;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    public final void buildCar() {
        buildFrame();
        addEngine();
        addWheels();
        addInterior();
        addExterior();
    }

    protected abstract void buildFrame();

    protected abstract void addEngine();

    protected abstract void addWheels();

    protected abstract void addInterior();

    protected abstract void addExterior();
}
