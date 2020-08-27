import java.util.*;

public class Main{
    
    public static String[] Reversewords(String s,int opt)
    {
        String arr[] = s.split(" ");
        switch(opt){
            case 0:
                for(int i=0;i<arr.length;i++)
                {
                    StringBuilder temp = new StringBuilder(arr[i]);
                    temp.reverse();
                    arr[i]=temp.toString();
                }
                break;
            case 1:
                for(int i=0;i<arr.length;i++)
                {
                    String temp = arr[i];
                    StringBuilder b = new StringBuilder(temp);
                    b.reverse();
                    for(int j=0;j<temp.length();j++)
                    {
                        char c = temp.charAt(j);
                        char res = b.charAt(j);
                        int len = temp.length();
                        if(Character.isUpperCase(c))
                        {
                            res = Character.toUpperCase(res);
                            c = Character.toLowerCase(c);
                            b.setCharAt(len-j-1,c);
                            b.setCharAt(j,res);
                        }
                    }
                    arr[i] = b.toString();
                }
                break;
            case 2:
                for(int i=0;i<arr.length;i++)
                {
                    String temp = arr[i];
                    StringBuilder b = new StringBuilder(); 
                    for(int j=0;j<temp.length();j++)
                    {
                        char c = temp.charAt(j);
                        if(Character.isUpperCase(c))
                        {
                            b.append(Character.toLowerCase(c));
                        }
                        else
                        {
                            b.append(Character.toUpperCase(c));
                        }
                    }
                    arr[i]=(b.reverse()).toString();
                }
                 break;
        }
        return arr;
    }
    
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int opt = s.nextInt();
        String arr [] = Reversewords(str,opt);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}


