public class Solution {
    int  maxDepth = 0;
    public int maxDepth(TreeNode root) { 
        if (root == null)
            return 0;
        findDepth(root, 1);
        return maxDepth;
        
    }
    public void findDepth(TreeNode root, int depth)
    {
        if (root == null)
            return;
        
        if (depth > maxDepth)
            maxDepth = depth;
        findDepth(root.left, depth+1);
        findDepth(root.right, depth+1);
        
    }
}
