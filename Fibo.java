public class Fibo
{
    public void getFibo(int size)
    {
        int prev = -1;
        int cur = 1;
        int count = 0;        
        int result = 0;

        while(count < size)
        {
            result = cur + prev;
            prev = cur;
            cur = result;   
            count++; 
        }
        System.out.println(cur);
    }

    public int getFiboRecur(int index)
    {
        if(index == 0 | index == 1)
            return index;
        
        return (getFiboRecur(index-1) + getFiboRecur(index - 2));        
    }

    public static void main(String args[])
    {
        Fibo obj = new Fibo();
        int size = 7;
        System.out.println(obj.getFiboRecur(4));
    }
} 
