import java.util.*;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if (head ==null)
            return null;


         if(head == head.next)
            return head;
        

        ListNode slowPtr;
        ListNode fastPtr;

        slowPtr = head;
        fastPtr = head;

        while(true)
        {
            if(slowPtr.next !=null && fastPtr.next!=null && fastPtr.next.next !=null)
            {
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next.next;
                if(slowPtr== fastPtr)
                {
                    break;
                }
            }
            else
            {
                return null;
            }
                
        }

        slowPtr = head;
        fastPtr.val = -999;
        while(slowPtr != fastPtr)
        {
            slowPtr = slowPtr.next;
            slowPtr.val = -999; 
        }

        while(true)
        {
            if(fastPtr.next.val == -999)
                break;
            fastPtr = fastPtr.next;
        }
        return fastPtr.next;
    }
}


