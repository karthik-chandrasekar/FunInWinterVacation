import java.util.*;

 
public class Solution {

    public void connect(TreeLinkNode root) {
        Queue<TreeLinkNode> myQueue = new LinkedList<TreeLinkNode>();
        TreeLinkNode temp;
        
        if (root == null)
            return;

        myQueue.add(root);
        myQueue.add(null); 
 
        while(true)
        {
            
            temp = myQueue.remove();
             if (myQueue.isEmpty() == true)
                break;
    
            if(temp == null)
            {
                myQueue.add(null);
                continue;
            } 
            temp.next = myQueue.peek();
            if(temp.left != null)
                myQueue.add(temp.left);
            if(temp.right != null)
                myQueue.add(temp.right);
        }
    }
}

