import java.util.*;
import java.util.Collections;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        
        LinkedList<ListNode> sumAns = new LinkedList<ListNode>();
        
        
        
        int c1, c2 = 0;
        int r1, r2 = 0;
        Iterator<Integer> it1 = l1.iterator();
        Iterator<Integer> it2 = l2.iterator();
        int len1, len2 = 0;
        int val1, val2 = 0;
        
        while(it1.hasNext())
        {
            len1++;
        }
        
        while(it2.hasNext())
        {
            len2++;
        }
        
        int lenDiff = Math.abs(len1-len2);
        
        
        
        while(true)
        {
            
            if (it1.hasNext() == false && it2.hasNext() == false)
                break;
            
            if(len1 > len2 && lenDiff != 0)
            {
                r1 = it1.next();
                r2 = c2 = c1 = 0;
                lenDiff --;
            }
            
            else if(len1 < len2 &&  lenDiff != 0)
            {   
                r2 = it2.next();
                r1 = c2 = c1 = 0;
                lenDiff --;
            }
            
            else if (lenDiff == 0)
            {
                val1  = it1.next();
                val2  = it2.next();
                
                r1 = val1 % 10;
                r2 = val2 % 10;
                
            }
            
            sumAns.add(r1+r2+c1+c2);
            
            c1 = val1 / 10;
            c2 = val2 / 10;
            
        }   
        return sumAns;
        
    }
}


