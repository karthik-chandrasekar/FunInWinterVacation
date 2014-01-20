import java.util.LinkedHashMap;
public class LRUCache {
    
    int limit;
    LinkedHashMap<Integer, Integer> cacheMap = new LinkedHashMap<Integer, Integer>();
    
    public LRUCache(int capacity) {
        this.limit = capacity;
    }
    
    public int get(int key) {
        
        if(cacheMap.containsKey(key))
        {
            return cacheMap.get(key);
        }
        else
        {
            return -1;
        }
        
    }
    
    public void set(int key, int value) {
   
    
    if(cacheMap.containsKey(key))
    {
        cacheMap.remove(key);
        
    }
    
    cacheMap.put(key, value);
     if(cacheMap.size() > limit)
    {
        cacheMap.remove(cacheMap.entrySet().iterator().next().getKey());
    }
        
    }

}
