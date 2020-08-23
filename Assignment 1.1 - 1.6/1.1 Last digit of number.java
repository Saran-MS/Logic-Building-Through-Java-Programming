import java.util.Scanner;

class lastdigit {
    int last(int input)
    {
        return Math.abs(input%10);
    }
} 

public class Main 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        lastdigit a = new lastdigit();
        System.out.println(a.last(val));
    }
}

