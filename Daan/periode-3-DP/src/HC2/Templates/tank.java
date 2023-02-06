package HC2.Templates;

public class tank extends VehicleTemplate {
    private boolean cannon;
    private int armorRating;
    public tank(boolean ignition, int gears, boolean cannon, int armorRating) {
        super(ignition, gears);
        this.cannon = cannon;
        this.armorRating = armorRating;
    }

    public boolean isCannon() {
        return cannon;
    }

    public void setCannon(boolean cannon) {
        this.cannon = cannon;
    }

    public int getArmorRating() {
        return armorRating;
    }

    public void setArmorRating(int armorRating) {
        this.armorRating = armorRating;
    }
}
