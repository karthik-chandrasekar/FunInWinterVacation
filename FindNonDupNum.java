import java.util.*;
public class Solution {
    public int singleNumber(int[] A) {
        HashMap<Integer, Integer> mymap = new HashMap<Integer, Integer>();
        
        for(Integer num : A )
        {
            if (mymap.containsKey(num))
            {
                mymap.put(num, -1);
            }
            else
            {
                mymap.put(num, 0);
            }
            
        }
        for (Map.Entry<Integer, Integer> entry : mymap.entrySet()) 
        {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value == 0)
            {
                return key;
            }
        }
        return 0;
    }
}
