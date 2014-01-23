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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;

        int curSum = 0;
        return checkHasPathSum(root, sum, curSum);
    }

    public boolean checkHasPathSum(TreeNode root, int sum, int curSum)
    {
        if (root == null)
            return false;

        curSum += root.val;
        if (root.left == null && root.right == null)
        {
            if (curSum == sum)
                return true;
        }
               
        return checkHasPathSum(root.left, sum, curSum) || checkHasPathSum(root.right, sum, curSum); 
    }

}
