import java.util.*;
import java.io.*;

class fibo
{
	 public long nthFibonacci(int input)
    {
        int val1=0,val2=1,val3=0;
        
        for(int i=3;i<=input;i++)
        {
            val3 = val1+val2;
            val1 = val2;
            val2 = val3;
        }
        return val3;
    }
    

}

public class Main{
	public static void main (String[] args) 
	{
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        fibo obj = new fibo();
        System.out.println(obj.nthFibonacci(n));
	}
}



