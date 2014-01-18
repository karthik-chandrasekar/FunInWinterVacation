import java.util.*;


public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        
        int c = 0;
        int r = 0;
        
        int val1 = 0, val2 = 0;
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode headResult = null;
        ListNode curr = null;
 
        l1 = head1; l2 = head2;
        while(l1 != null  || l2 !=null)
        {           
            if (l1 == null)
            {
                r = (l2.val + c)%10;
                val2 = l2.val;
                l2=l2.next;
                val1 = 0;
                
            
            }
            
            else if (l2 == null)
            {
                r = (l1.val+c)%10;
                val1 = l1.val;
                l1=l1.next;
                val2 = 0;
                
                
            }
            
            
            else 
            {
                val1  = l1.val;
                val2  = l2.val;
                l1 = l1.next;
                l2 = l2.next;
                r = (val1 + val2 + c) % 10; 
                
            }
            
            
            ListNode sumAns = new ListNode(r);
            
            if(headResult == null)
            {
                headResult = curr = sumAns;
                
            }
            else
            {
                curr.next = sumAns;
                curr = curr.next;
            }
            
            
            c = (val1 + val2 + c) / 10;
            

            if (l1 == null && l2 ==null)
            {
                if (c != 0)
                {
                    sumAns = new ListNode(c);
                    curr.next = sumAns;
                }
            }
        }   
        return headResult;
        
    }
} 
