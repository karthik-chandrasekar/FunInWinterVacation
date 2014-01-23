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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null || n < 0)
        {
            return null;
        }

        ListNode firstPtr, secondPtr;
        firstPtr = secondPtr = head;
        
        while(n != 0 )
        {
            if (secondPtr == null)
                break;
            secondPtr = secondPtr.next;
            n --;
        }

        if (n==0 && secondPtr == null)
            return head.next;
        
        if (secondPtr == null)
            return null;   
 

        while(true)
        {
            if(secondPtr.next == null)
                break;
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }

        firstPtr.next = firstPtr.next.next;
        return head;
    }
}
