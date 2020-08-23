import java.util.Scanner;

class SecondDigit{
    int secondLastDigit(int input)
    {
        if(input>=0 && input<9)
        {
            return -1;
        }
        else
        {
            return Math.abs((input/10)%10);
        }
    }
}

public class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        SecondDigit a = new SecondDigit();
        System.out.println(a.secondLastDigit(val));
    }
}

