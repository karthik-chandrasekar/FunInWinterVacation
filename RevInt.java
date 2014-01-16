public class Solution {
      public int reverse(int x) {
        int q = x;
        int r;
        String num="";
        int sign = 1;
        if (x==0)
            return 0;
        while(true)
        {
            r = q %10;
            q = q/10;
            
            if (r<0)
            {
                r = r * -1;
            }
            num += r;
            if (q==0)
                break;
        }
        if (x<0)
        {
            sign = -1;
        }
        return (Integer.parseInt(num)*sign);
    }
}
