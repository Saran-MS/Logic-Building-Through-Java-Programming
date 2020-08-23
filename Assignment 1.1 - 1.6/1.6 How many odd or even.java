import java.util.*;

class oddeven
{
    int count=0;
    int countEvenOdds(int input1,int input2,int input3,int input4,int input5,String input)
    {
        if (input.equals("odd"))
        {
            if (input1%2!=0)
            {
                count++;
            }
            if (input2%2!=0)
            {
                count++;
            }
            if (input3%2!=0)
            {
                count++;
            }
            if (input4%2!=0)
            {
                count++;
            }
            if (input5%2!=0)
            {
                count++;
            }
            
        }
        if (input.equals("even"))
        {
            if (input1%2==0)
            {
                count++;
            }
            if (input2%2==0)
            {
                count++;
            }
            if (input3%2==0)
            {
                count++;
            }
            if (input4%2==0)
            {
                count++;
            }
            if (input5%2==0)
            {
                count++;
            }
            
        }
        
        return count;
    }
}

public class Main{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int val1 = s.nextInt();
        int val2 = s.nextInt();
        int val3 = s.nextInt();
        int val4 = s.nextInt();
        int val5 = s.nextInt();
        String operation = s.next();
        oddeven obj = new oddeven();
        System.out.println(obj.countEvenOdds(val1,val2,val3,val4,val5,operation));
    }
}

