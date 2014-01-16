import java.util.*;
public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList<Integer> inorder = new ArrayList<Integer>();
        
        if (root == null)
                    return inorder;
        while(true)
        {
            while(root != null)
            {
                stack.push(root);
                root = root.left;
            }
            if(stack.isEmpty())
                break;
            root = stack.peek();
            inorder.add(root.val);
            stack.pop();
            root = root.right;
            
            
        }
        return inorder;
    }
}
