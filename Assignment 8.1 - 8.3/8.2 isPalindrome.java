import java.util.*;

public class Main {
    public int isPalindrome(String s)
    {
        StringBuilder rev = new StringBuilder(s);
        String str = rev.reverse().toString();
        str = str.toLowerCase();
        if(str.equals(s))
        {
            return 2;
        }
        else
        {
            return 1;
        }
      
        
    }
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        Main obj = new Main();
        System.out.println(obj.isPalindrome(str.toLowerCase()));
    }
    
}


