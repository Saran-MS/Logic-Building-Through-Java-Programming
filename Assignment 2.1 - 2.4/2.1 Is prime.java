import java.util.*;

class prime{
    public int isPrime(int input)
    {
        for(int i=2;i<=(input/2);i++)
        {
            if(input%i==0)
            {
                return 1;
            }
        }
        return 2;
        
    }
 }


public class Main{
     public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        prime obj = new prime();
        System.out.println(obj.isPrime(n));
    }
}
    



