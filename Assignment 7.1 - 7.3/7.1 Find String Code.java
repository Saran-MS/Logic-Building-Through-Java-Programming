import java.util.*;

public class Main{
    public int code(String s)
    {
        String arr[] = s.split(" ");
        int len = arr.length;
        StringBuffer res = new StringBuffer();
        for(int i=0;i<len;i++)
        {
            int wordSize = arr[i].length();
            int sum=0;
            for(int j=0;j<wordSize/2;j++)
            {
                int k = wordSize-j-1;
                int large=0;
                int small=0;

                if(letterofNum(arr[i].charAt(j))>letterofNum(arr[i].charAt(k)))
                {
                    large = letterofNum(arr[i].charAt(j));
                    small = letterofNum(arr[i].charAt(k));
                }
                else
                {
                    large = letterofNum(arr[i].charAt(k));
                    small = letterofNum(arr[i].charAt(j));
                }
                sum += large - small;

            }

            if(wordSize%2!=0)
            {
                sum+=letterofNum(arr[i].charAt(wordSize/2));
            }
            res.append(sum);
        }
        return Integer.parseInt(res.toString());
    }

    public static int letterofNum(char c)
    {
        if(c>=65 && c<=90)
        {
            return c-64;
        }
        if(c>97 && c<=122)
        {
            return c-96;
        }
        return 0;
    }


    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        Main obj = new Main();
        System.out.println(obj.code(str));
    }

}

