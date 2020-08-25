import java.util.*;

public class Main{
    
    public static String SecondWord(String s)
    {
        String res=null;
        String arr[] = s.split(" ");
        int len = arr.length;
        if(len>1)
        {
            res = arr[1].toUpperCase();
        }
        else
        {
            res = "LESS";
        }
        return res;
    }
    
    
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(SecondWord(str));
        
    }
} 


