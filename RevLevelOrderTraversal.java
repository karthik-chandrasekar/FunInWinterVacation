import java.util.*;
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> myQueue = new LinkedList<TreeNode>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        TreeNode temp;
        
        if (root == null)
            return result;

        myQueue.add(root);
        myQueue.add(null); 
      
 
        while(true)
        {
            
            temp = myQueue.remove();
            if (myQueue.isEmpty() == true)
            {    
                result.add(tempList);
                break;
            }
            if(temp == null)
            {
                myQueue.add(null);
                result.add(tempList);
                tempList = new ArrayList<Integer>();
                continue;
            } 
            tempList.add(temp.val);
            if(temp.left != null)
                myQueue.add(temp.left);
            if(temp.right != null)
                myQueue.add(temp.right);
        
        }
        Collections.reverse(result);
        return result;
    }
}

