import java.util.*;

public class Solution {

    ArrayList<String> result = new ArrayList<String>();
    public ArrayList<String> generateParenthesis(int n) {
    if (n <=0)
        return result;    

    getParen(n, n,  " ");
    return result;
    }
    
    public void getParen(int open, int close, String paren)
    {
        if(open < 0 || close < 0)
        {
            return;
        }
        
        if(open>close)
            return;

        getParen(open-1, close, paren+"(");
        getParen(open, close-1, paren+")");
        
        if(open ==0 && close ==0)
        {
            paren = paren.trim();
            result.add(paren);
        }
    }
}

