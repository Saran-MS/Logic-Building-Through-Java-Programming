import java.util.*;

class sum {
    public int SumofDigits(int val,int power)
    {
        int temp = (int) Math.pow(val,power);
        int total=0;
        while(temp>0)
        {
            total+=temp%10;
            temp/=10;
        }
        return total;
    }
}


public class Main
{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        int pow = s.nextInt();
        sum obj = new sum();
        System.out.println(obj.SumofDigits(val,pow));
    }
}

