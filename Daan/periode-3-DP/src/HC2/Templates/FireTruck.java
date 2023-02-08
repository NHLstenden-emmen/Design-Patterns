package HC2.Templates;

public class FireTruck extends VehicleTemplate {

    private int waterTankCapacity;
    private boolean siren;
    public FireTruck(boolean ignition, int gears, int waterTankCapacity, boolean siren) {
        super(ignition, gears);
        this.waterTankCapacity = waterTankCapacity;
        this.siren = siren;
    }

    public int getWaterTankCapacity() {
        System.out.println(waterTankCapacity);
        return waterTankCapacity;
    }

    public void setWaterTankCapacity(int waterTankCapacity) {
        this.waterTankCapacity = waterTankCapacity;
    }

    public boolean isSiren() {
        return siren;
    }

    public void setSiren(boolean siren) {
        this.siren = siren;
    }
}
