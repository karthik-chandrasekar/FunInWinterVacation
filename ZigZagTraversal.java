/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;

public class Solution {
      public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
    Stack<TreeNode> stack1 = new Stack<TreeNode>();
    Stack<TreeNode> stack2 = new Stack<TreeNode>();
    ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> innerOutput = new ArrayList<Integer>();
    TreeNode top;
    int flag = 0;

    if (root == null)
    {
        return output;
        
    }
    stack1.push(root);
    innerOutput.add(root.val);
    output.add(innerOutput);
    
    while(!stack1.isEmpty() || !stack2.isEmpty())
    {
        innerOutput = new ArrayList<Integer>();
        flag = 0;
        while (!stack1.isEmpty())
        {
            
            
            top = stack1.peek();
            if (top.right != null)
            {
                flag = 1;
                stack2.push(top.right);
                innerOutput.add(top.right.val);
            }
            
            if (top.left != null)
            {
                flag = 1;
                stack2.push(top.left);
                innerOutput.add(top.left.val);
            }
            
            
            stack1.pop();
            
        }
        if (flag == 1)
            {
                output.add(innerOutput);
            }
        
        innerOutput = new ArrayList<Integer>();
        flag = 0;
        while (!stack2.isEmpty())
        {
                
                

                top = stack2.peek();
                if (top.left != null)
                {
                    flag = 1;
                    stack1.push(top.left);
                    innerOutput.add(top.left.val);
                }
                if (top.right!=null)
                {
                    flag = 1;
                    stack1.push(top.right);
                    innerOutput.add(top.right.val);
                }
               
                stack2.pop();
        }
         if (flag == 1)
                {
                    output.add(innerOutput);    
                }
        
    }
    return output;
        
    }

}
