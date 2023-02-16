package Week2.Template;

public class FamilyCar extends CarTemplate {
    public FamilyCar(String make, String model, int horsepower, int torque, int topSpeed, int acceleration) {
        super(make, model, horsepower, torque, topSpeed, acceleration);
    }

    @Override
    protected void buildFrame() {
        System.out.println("Building frame for a family car");
    }

    @Override
    protected void addEngine() {
        System.out.println("Adding a fuel-efficient engine to the family car");
    }

    @Override
    protected void addWheels() {
        System.out.println("Adding durable wheels to the family car");
    }

    @Override
    protected void addInterior() {
        System.out.println("Adding spacious interior to the family car");
    }

    @Override
    protected void addExterior() {
        System.out.println("Adding practical exterior to the family car");
    }
}