import java.util.*;

public class Main {

public int nFactorial(int input)
{
    if(input==0)
    {
        return 1;
    }
    else
    {
        return input*nFactorial(input-1);
    }
}


public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int fact = s.nextInt();
    Main obj = new Main();
    System.out.println(obj.nFactorial(fact));
    
}

}
