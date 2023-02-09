package Observer;

import java.util.ArrayList;
import java.util.List;

public class RDWDataList {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

//    public void updateData(List<RDWData> newData) {
//        data = newData;
//        for (Observer observer : observers) {
//            observer.update(data);
//        }
//    }
}