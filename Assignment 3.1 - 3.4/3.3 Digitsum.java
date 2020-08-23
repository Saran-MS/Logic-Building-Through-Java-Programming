import java.util.*;

class sum {
    public int digitSum(int input)
    {
        int total =0;
        while(input>0)
        {
            total += input%10;
            input/=10;
            
        }
        return total;
    }
}

public class Main{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        sum obj = new sum();
        if(val>=0)
        {
            while(val>9)
            {
                val = obj.digitSum(val);
            }
             System.out.println(val);
        }
        else
        {
            val = Math.abs(val);
            while(val>9)
            {
                val= obj.digitSum(val);
                
            }
            System.out.println("-"+val);
            
        }
       
        
    }
}



