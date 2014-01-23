public class Solution {
    public int searchInsert(int[] A, int target) {
     
        int i;
        int ALen = A.length;
        if (target < A[0])
            return 0;

        if (target > A[ALen-1])
            return ALen;
        
        for(i=0;i<ALen;i++)
        {
            if(A[i] >= target)
                break;
        }
        return i;
    }
}
