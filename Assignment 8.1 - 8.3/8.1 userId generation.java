import java.util.*;

public class Main{
    
    public static void userid(String Fname,String Lname,int pin,int n)
    {
        int str1 = Fname.length();
        int str2 = Lname.length();
        String LargerName; 
        String SmallerName;
        StringBuilder str = new StringBuilder();
        if(str1>str2)
        {
            LargerName = Fname;
            SmallerName = Lname;
        }
        else if(str1<str2)
        {
            LargerName = Lname;
            SmallerName = Fname;
        }
        else
        {
            for(int i=0;i<str1;i++)
            {
                if(Fname.charAt(i)>Lname.charAt(i))
                {
                    LargerName = Fname;
                    SmallerName = Lname;
                    break;
                }
                else if(Fname.charAt(i)<Lname.charAt(i))
                {
                    LargerName = Lname;
                    SmallerName = Fname;
                    break;
                }
                else
                {
                    continue;
                }
            }
        }
        str.append(Fname.charAt(0));
        str.append(Lname);
        String p = Integer.toString(pin);
        int len = p.length();
        str.append(p.charAt(n-1));
        str.append(p.charAt(len-n));
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(Character.isUpperCase(c))
            {
                c = Character.toLowerCase(c);
                res.append(c);
            }
            else
            {
                c = Character.toUpperCase(c);
                res.append(c);
            }
        }
        System.out.println(res);
        
    }
    
    
    
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String Fname = s.nextLine();
        String Lname = s.nextLine();
        int pin = s.nextInt();
        int n = s.nextInt();
        userid(Fname,Lname,pin,n);
    }
}

