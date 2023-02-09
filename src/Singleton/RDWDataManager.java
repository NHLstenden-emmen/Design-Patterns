package Singleton;

public class RDWDataManager {
    private static RDWDataManager instance = null;

    private RDWDataManager() {}

    public static RDWDataManager getInstance() {
        if (instance == null) {
            instance = new RDWDataManager();
        }
        return instance;
    }

//    public void addRDWData(RDWData data) {
//        this.data.add(data);
//    }
//
//    public List<RDWData> getRDWData() {
//        return data;
//    }
}
