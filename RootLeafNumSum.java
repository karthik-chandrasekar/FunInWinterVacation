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
    
    
    int totalSum = 0;
    
    public int sumNumbers(TreeNode root) {
        String currEle = "";
        return actualSum(root, currEle);
    }
    
    int actualSum(TreeNode root, String currEle)
    {
        
        if (root == null)
                return 0;
        currEle += root.val;
        if (root.left == null && root.right == null)
        {
                try
                {
                    currEle = currEle.trim();
                    totalSum += Integer.parseInt(currEle);
       
                }
                catch(Exception e)
                {
                    //sdfdskfjsl;
                }
        }
        actualSum(root.left, currEle);
        actualSum(root.right, currEle);
        return totalSum; 
    }

}
