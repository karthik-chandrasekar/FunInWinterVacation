mport java.util.*;
import java.util.Map.Entry;
public class Solution {
    public int removeDuplicates(int[] A) {
 
        int len = A.length;
        if (len ==0 )
            return 0;
        else if (len ==1 || len ==2)
            return A[0];
        
        int result =0;
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        int[] resultArray = new int[len];
        int index = 0;
        for(int a : A)
        {   
            if(myMap.containsKey(a) && myMap.get(a) >2)
            {
                continue;
            }
            else if (myMap.containsKey(A))
            {
                myMap.put(a, myMap.get(a)+1);
            }
            else
            {
                myMap.put(a, 0);
            }
            resultArray[index] = a;
            index ++;
        }

        for(Entry<Integer, Integer> kv : myMap.entrySet())
        {   
            if (kv.getValue() < 3)
            {
                result = kv.getKey();
                break;
            }
        }
        A = resultArray;
        return resultArray.length;
    }
}
