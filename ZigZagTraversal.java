public class Solution {
      public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
    Stack<TreeNode> stack1 = new Stack<TreeNode>();
    Stack<TreeNode> stack2 = new Stack<TreeNode>();
    ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> innerOutput = new ArrayList<Integer>();

    if (root == null)
    {
        return output;
        
    }
    stack1.push(root);
    innerOutput.add(root.val);
    output.add(innerOutput);
    
    while(false == stack1.isEmpty() && false == stack2.isEmpty())
    {
        
        while (false == stack1.isEmpty())
        {
            innerOutput.clear();
            stack2.push(stack1.peek().left);
            innerOutput.add(stack1.peek().left.val);
            innerOutput.add(stack1.peek().right.val);
            output.add(innerOutput);
            stack2.push(stack1.peek().right);
            stack1.pop();
            
        }
        while (false == stack2.isEmpty())
        {
                innerOutput.clear();
                stack1.push(stack2.peek().right);
                stack1.push(stack2.peek().left);
                innerOutput.add(stack1.peek().right.val);
                innerOutput.add(stack1.peek().left.val);
                output.add(innerOutput);    
                stack2.pop();
        }
        
    }
    return output;
        
    }

}
