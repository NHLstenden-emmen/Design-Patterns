package Iterators;

import Iterators.Cache;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

// Implement Iterator interface for the Cache class
public class CacheIterator implements Iterator<Map.Entry<String, HashMap>> {
    // Reference to the Cache object
    private final Cache cache;
    // Keep track of the current position in the cache
    private int position = 0;

    // Constructor to initialize the Cache object
    public CacheIterator(Cache cache) {
        this.cache = cache;
    }

    // Check if there is a next entry in the cache
    @Override
    public boolean hasNext() {
        // Return true if position is less than the size of the cache, else false
        return position < cache.getSize();
    }

    // Get the next entry in the cache
    @Override
    public Map.Entry<String, HashMap> next() {
        // If there is no next entry, throw a NoSuchElementException
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        // Return the next entry in the cache and increment the position
        return (Map.Entry<String, HashMap>) cache.getCache().entrySet().toArray()[position++];
    }
}


