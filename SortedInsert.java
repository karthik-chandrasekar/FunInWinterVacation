
class TreeNode
{
    int val;
    TreeNode left;

    public TreeNode(int val)
    {
        this.val = val;
    }
}


public class SortedInsert
{

    public TreeNode insert(TreeNode head)
    {
        int i;
        TreeNode cur;
        cur = head;
        for(i=1;i<5;i++)
        {
            cur.left = new TreeNode(i);
            cur = cur.left;
        }        

        return head;
    }


    public void printList(TreeNode head)
    {

        if (head == null)
            return;

        TreeNode cur;
        cur = head;

        while(cur != null)
        {
            System.out.println(cur.val);
            cur = cur.left;
        }
        
     }


    public TreeNode sortedInsert(TreeNode head, int val)
    {
    
        TreeNode cur;
        cur = head;

        TreeNode newNode = new TreeNode(val);
        if (head == null)
            return newNode;

        if(val < head.val)
        {
            newNode.left = head;
            head = newNode;
            return head;
        }

        cur = head;
    
        while(cur.left != null && cur.left.val < val)
        {
            cur = cur.left;
            
        }

        if (cur.left == null)
        {
            cur.left = newNode;
            return head;
            
        }
    

        if(cur.left.val >= val)
        {
           newNode.left = cur.left;
           cur.left = newNode;
           return head; 
        }

        return head;

    }

    public static void main(String args[])
    {
        //creating head
        TreeNode head = new TreeNode(0);
        
        //Form sorted linked list
        SortedInsert obj = new SortedInsert();
        head = obj.insert(head);

        //Print linked list
        obj.printList(head);

        // do sorted insert
        head = obj.sortedInsert(head, 10);
        head = obj.sortedInsert(head, -5);
        head = obj.sortedInsert(head, 7);

        //Print to check the insertions
        obj.printList(head);
    }
}
