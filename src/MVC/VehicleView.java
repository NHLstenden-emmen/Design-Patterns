package MVC;

// View class to display the data
public class VehicleView {
    public void displayVehicleData(String make, String model, String licensePlate) {
        System.out.println("Vehicle Data: ");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("License Plate: " + licensePlate);
    }
}
