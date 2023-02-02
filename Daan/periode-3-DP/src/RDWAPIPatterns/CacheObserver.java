package RDWAPIPatterns;

public class CacheObserver implements Observer {
    // The subject being observed.
    private CachingDecorator cachingDecorator ;

    // Constructor that takes in a subject and registers as its observer.
    public CacheObserver(CachingDecorator cachingDecorator) {
        this.cachingDecorator = cachingDecorator;
        this.cachingDecorator.attach(this);
    }

    // Implements the update method of the Observer interface.
    // This method will be called whenever the subject's state changes.
    @Override
    public void update() {
        System.out.println("Observer: chache size increased to: " + cachingDecorator.getCacheSize());
    }
}
