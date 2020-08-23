import java.util.*;

class sum {
    public int EvenOddDigitsSum(int input1,String input2)
    {
        int total = 0;
        if(input2.equals("odd"))
        {
            while(input1>0)
            {
                int val = input1%10;
                if(val%2!=0)
                {
                    total+=val;
                }

                input1/=10;
            }
        }
        if(input2.equals("even"))
        {
            while(input1>0)
            {
                int val = input1%10;
                if(val%2==0)
                {
                    total+=val;
                }
                input1/=10;
            }
        }
        return total;
    }
}

public class Main{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        String op = s.next();
        sum obj = new sum();
        System.out.println(obj.EvenOddDigitsSum(val,op));
    }
}

