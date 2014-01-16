import java.util.*;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
      int i = 0;
      int j = numbers.length - 1;
      int indexArray [] = new int[2];
      Arrays.sort(numbers);
      while(i<j)
      {
          if (numbers[i] + numbers[j] > target)
          {
              j--;
          }
          else if (numbers[i]+numbers[j]<target)
          {
              i++;
          }
          else if (numbers[i]+numbers[j]==target)
          {
              indexArray[0] = i;
              indexArray[1] = j;
              break;
          }
      }
      return indexArray;
    }
}
