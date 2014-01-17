import java.util.*;
public class Solution {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        ArrayList<Integer> resultArray = new ArrayList<Integer>();
        if (root == null)
            return resultArray;
        stack1.push(root);
        
        while(!stack1.isEmpty())
        {
            root = stack1.peek();
            
            stack1.pop();
            if (root == null)
                continue;
            stack2.push(root);
            stack1.push(root.left);
            stack1.push(root.right);
        }
        
        while(!stack2.isEmpty())
        {
            root = stack2.peek();
            resultArray.add(root.val);
            stack2.pop();
        }
        return resultArray;
    }
}
