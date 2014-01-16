import java.util.*;
public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList<Integer> inorder = new ArrayList<Integer>();
        
        if (root == null)
                    return inorder;
        while(true)
        {
            while(root != null)
            {
                stack.push(root);
                inorder.add(root.val);
                root = root.left;
            }
            if(stack.isEmpty())
                break;
            root = stack.peek();
            
            stack.pop();
            root = root.right;
            
            
        }
        return inorder;
    }
}
