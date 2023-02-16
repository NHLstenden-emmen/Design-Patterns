package Week2.Template;

public class SportsCar extends CarTemplate {
    public SportsCar(String make, String model, int horsepower, int torque, int topSpeed, int acceleration) {
        super(make, model, horsepower, torque, topSpeed, acceleration);
    }

    @Override
    protected void buildFrame() {
        System.out.println("Building frame for a sports car");
    }

    @Override
    protected void addEngine() {
        System.out.println("Adding a high-performance engine to the sports car");
    }

    @Override
    protected void addWheels() {
        System.out.println("Adding sporty wheels to the sports car");
    }

    @Override
    protected void addInterior() {
        System.out.println("Adding luxurious interior to the sports car");
    }

    @Override
    protected void addExterior() {
        System.out.println("Adding aerodynamic exterior to the sports car");
    }
}
