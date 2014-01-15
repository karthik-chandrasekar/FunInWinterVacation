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
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        if((root.left==null && root.right!=null) || (root.left != null) && (root.right == null))
        {
            return false;
        }
        if (root.left==null && root.right == null)
                return true;
        return checkSym(root.left, root.right);
   
    }
    
    public boolean checkSym(TreeNode root1, TreeNode root2)
    {
        if (root1 == null && root2 == null)
            return true;
        if( (root1==null && root2!=null) || (root1 != null && root2 ==null))
            return false;
        return (root1.val == root2.val) && checkSym(root1.left, root2.right) && checkSym(root1.right, root2.left);
        
    }
}
