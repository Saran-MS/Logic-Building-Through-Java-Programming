import java.util.*;

class multiple{
    int isMultiple(int input1,int input2)
    {
        if(input1==0 || input2==0)
        {
            return 3;
        }
        else if ((input2%input1)==0)
        {
            return 2;
        }
        else 
        {
            return 1;
        }
    }
}

public class Main{
    public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    int val1 = s.nextInt();
    int val2 = s.nextInt();
    multiple obj = new multiple();
    System.out.println(obj.isMultiple(val1,val2));
}
}

