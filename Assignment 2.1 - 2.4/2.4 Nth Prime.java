import java.util.*;

class prime{
    int NthPrime(int input)
    {
        int count=0,i,val=1;
        
        while(count<input)
        {
            val+=1;
            for(i=2;i<=val;i++)
            {
                if(val%i==0)
                {
                    break;
                }
            }
            if(i==val)
            {
                count+=1;
            }
        }
        return val;
    }
}

public class Main{

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        prime obj = new prime();
        System.out.println(obj.NthPrime(n));
        
    }
}



