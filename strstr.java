import java.io.*;
public class Solution {
    public String strStr(String haystack, String needle) {
        
        if (haystack == null || needle == null)
            return null;
        
        int haystackLen = haystack.length();
        int needleLen = needle.length();
        
        if (haystackLen < needleLen )
            return null;
        if(haystackLen ==0 && needleLen ==0 || needleLen ==0)
            return haystack;
        if (haystackLen ==0)
            return null;
        int startIndex = -1;
        int currIndex = 0;
        int needleIndex = 0;
        char[] subChar = needle.toCharArray();
        char[] superChar = haystack.toCharArray();
        while(true)
        {
            if(needleIndex == needleLen || currIndex == haystackLen) 
                break;
            
            if(superChar[currIndex] == subChar[needleIndex] )
            {
                if (needleIndex == 0)
                {
                    startIndex = currIndex;
                }
                
                needleIndex++;
                currIndex++;
            }
            else
            {
                startIndex = startIndex+1;
                currIndex = startIndex;
                needleIndex = 0;
            }
            
        }
        
        if(startIndex == 0 && needleIndex != needleLen)
            return null; 
            
        else if (startIndex != 0 && needleIndex != needleLen)
            return null;
        else if (needleIndex == needleLen)
            return haystack.substring(startIndex);
        
        return null;
    }

}
