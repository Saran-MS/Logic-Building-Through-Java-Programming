import java.util.*;

class palindrome{
    public int isPalinNum(int input)
    {
        int temp = input,rev=0,rem=0;
        while(temp>0)
        {
            rem = temp%10;
            rev = rev*10+ rem;
            temp/=10;
        }
        if(rev==input)
        {
            return 2;
        }
        else 
        {
            return 1;
        }
    }

    
}

public class Main {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        palindrome obj = new palindrome();
        int result = obj.isPalinNum(val);
        if(result==2)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}

