package Week2.State;

abstract class CarState {
    protected Car car;

    public CarState(Car car) {
        this.car = car;
    }
    //State pattern is eigenlijk en plan wat stapsgewijst moet doorgaan via dezelfde functionaliteit. Stap 1 moet voltooid zijn om stap 2 te kunnen gebruiken
    public abstract void startEngine();
    public abstract void drive();
    public abstract void stopEngine();
}

class OffState extends CarState {
    public OffState(Car car) {
        super(car);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine");
        car.setState(new OnState(car));
    }

    @Override
    public void drive() {
        System.out.println("Cannot drive with engine off");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine is already off");
    }
}

class OnState extends CarState {
    public OnState(Car car) {
        super(car);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine is already on");
    }

    @Override
    public void drive() {
        System.out.println("Driving");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping engine");
        car.setState(new OffState(car));
    }
}

class Car {
    private CarState state;

    public Car() {
        state = new OffState(this);
    }

    public void setState(CarState state) {
        this.state = state;
    }

    public void startEngine() {
        state.startEngine();
    }

    public void drive() {
        state.drive();
    }

    public void stopEngine() {
        state.stopEngine();
    }
}