import java.util.*;

class digitcount {
    public int allDigitsCount(int input)
    {
        int count=0;
        while(input>0)
        {
            input/=10;
            count++;
        }
        return count;
    }
    
}


public class Main{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        digitcount obj = new digitcount();
        System.out.println(obj.allDigitsCount(val));
        
    }
}


