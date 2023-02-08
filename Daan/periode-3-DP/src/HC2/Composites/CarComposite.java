package HC2.Composites;

import java.util.ArrayList;
import java.util.List;

public class CarComposite implements CarDataComponent{
    private List<CarDataComponent> carDataComponents = new ArrayList<>();

    @Override
    public void operation() {
        for (CarDataComponent carDataComponent : carDataComponents) {
            carDataComponent.operation();
        }
    }

    public void add(CarDataComponent carDataComponent){
        carDataComponents.add(carDataComponent);
    }

    public void remove(CarDataComponent carDataComponent){
        carDataComponents.remove(carDataComponent);
    }
}
