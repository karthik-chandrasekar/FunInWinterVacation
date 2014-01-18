public class atoi {
    public int atoiFunc(String str) {
      
        int result = 0;
        int sign = 1;
        
        if (str == "")
            return 0;
        str = str.trim();
        for (char ch: str.toCharArray())
        {   
            System.out.println(ch);
            System.out.println(sign);
            System.out.println(result);
            
            if ((int)ch == 45)
            {
                sign = -1;
                continue;
            }
            else if ((int)ch == 43)
            {
                continue;
            }
            if ((int)ch >47 && (int)ch<58)
            {
                result = result * 10 + ((int)ch - (int)'0');
            }
            
            else
            {
                return result * sign;
            }
            
        }
        System.out.println("Before returning " + result + "   " + sign);
        
        return result * sign;
    }
    
    public static void main(String args[])
    {
        atoi a = new atoi();
        System.out.println(a.atoiFunc("2147483648"));
    }
}
