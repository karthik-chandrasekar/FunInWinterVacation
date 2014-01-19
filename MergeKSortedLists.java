public class Solution {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        
        if (lists.isEmpty())
            return null;
        if (lists.get(0) == null && lists.size() == 1)
            return null;
        
        return mergeTwoList(lists, 0, lists.size()-1);
        
    }
    
    public ListNode mergeTwoList(ArrayList<ListNode> lists, int index, int limit)
    {
        
        if (index == limit)
        {
            return lists.get(index);
        }
        
        
        
        ListNode firstList , secondList, head = null, curr = null;
        firstList = mergeTwoList(lists, index+1, limit);
        secondList = lists.get(index);
        
        
        if (firstList == null)
            return secondList;
        
        if (secondList == null)
            return firstList;
        
        while(firstList != null || secondList != null)
        {
            if(firstList == null)
            {
                curr.next = secondList;
                break;
            }
            
            if(secondList == null)
            {
                curr.next = firstList;
                break;
            }
            
            if (firstList.val <= secondList.val)
            {
                if (head == null)
                {
                head = curr = firstList;
                firstList = firstList.next;
                }
                else
                {
                    curr.next =  firstList;
                    curr = curr.next;
                    firstList = firstList.next;
                }
            }
            
            
            
            else if ( firstList.val > secondList.val)
            {
                if (head == null)
                {
                    head = curr = secondList;
                    secondList = secondList.next;
                }
                else
                {
                    curr.next = secondList;
                    curr = curr.next;
                    secondList = secondList.next;
                }
            }
            
        }
        return head;
                
    }
}
