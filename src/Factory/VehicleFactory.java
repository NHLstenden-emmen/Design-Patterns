package Factory;

public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type.equals("car")) {
            return new Personenauto();
        } else if (type.equals("Vrachtwagen")) {
            return new Vrachtwagen();
        }
        return null;
    }

}
