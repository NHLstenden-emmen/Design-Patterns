package HC2.Templates;

public class VehicleTemplate {
    boolean ignition;
    int gears;
    int currentGear;

    public VehicleTemplate(boolean ignition, int gears) {
        this.ignition = ignition;
        this.gears = gears;
        this.currentGear = 0;
    }

    public void upShift() {
        if (currentGear < gears) {
            currentGear += 1;
        }
        System.out.println(currentGear);
    }

    public void downShift() {
        if (currentGear > 0) {
            currentGear -= 1;
        }
        System.out.println(currentGear);
    }

    public boolean isIgnition() {
        return ignition;
    }

    public void setIgnition(boolean ignition) {
        this.ignition = ignition;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}
