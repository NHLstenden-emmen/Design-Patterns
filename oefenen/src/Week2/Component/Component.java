package Week2.Component;
import java.util.ArrayList;
import java.util.List;
interface RDWCar {
    void printDetails();
}

// Leaf class
class RDWSingleCar implements RDWCar {
    private String licensePlate;

    public RDWSingleCar(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void printDetails() {
        System.out.println("License Plate: " + licensePlate);
    }
}

// Composite class
class RDWCarCollection implements RDWCar {
    private List<RDWCar> carList = new ArrayList<>();

    public void addCar(RDWCar car) {
        carList.add(car);
    }

    public void removeCar(RDWCar car) {
        carList.remove(car);
    }

    public void printDetails() {
        for (RDWCar car : carList) {
            car.printDetails();
        }
    }
}

