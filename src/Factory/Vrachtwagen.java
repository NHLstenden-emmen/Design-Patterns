package Factory;

public class Vrachtwagen implements Vehicle {
    private String data;

    @Override
    public void setData(String data) {
        this.data = data;
    }
}
