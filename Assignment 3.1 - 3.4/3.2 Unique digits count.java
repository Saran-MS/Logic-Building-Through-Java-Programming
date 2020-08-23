import java.util.*;

class unique{
    public int uniqueDigitsCount(int input)
    {
        int count=0;
        String s = Integer.toString(input);
        int len = s.length();
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    count++;
                    break;
                }
            }
        }
        return len-count;
    }
}

public class Main{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        unique obj = new unique();
        System.out.println(obj.uniqueDigitsCount(val));
    }
    
}

