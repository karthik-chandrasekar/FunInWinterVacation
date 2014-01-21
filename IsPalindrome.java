public class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        if (s.isEmpty())
            return true;
        int i, j;
        int slen = s.length();
        s = s.toLowerCase();
        char []sarray = s.toCharArray();

        for(i=0, j=slen-1;i<j;i++,j--)
        {
            if(sarray[i] != sarray[j])
                return false;
        }
        return true;
    }
}
