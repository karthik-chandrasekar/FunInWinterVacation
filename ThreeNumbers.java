import java.util.*;
import java.util.Map.Entry;
public class Solution {
    public int singleNumber(int[] A) {
 
        if(A.length == 0)
            return 0;
            
        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for(int num : A)
        {
            if(numMap.containsKey(num))
            {
                numMap.put(num, numMap.get(num)+1);
            }
            else
            {
                numMap.put(num, 0);
            }
        }
        int result=0;
        for(Entry<Integer, Integer> pair : numMap.entrySet())
        {
            if (pair.getValue() == 0)
                result =  pair.getKey();
    
        }
        return result;
    }
}
