import java.util.*;

class sumOfSums{
    public int sumOfSumsOfDigits(int input)
    {
       String s = Integer.toString(input);
       int len = s.length();
       int total=0;
       for(int i=0;i<len;i++)
       {
           for(int j=i;j<len;j++)
           {
              total+= Integer.parseInt(String.valueOf(s.charAt(j)));
           }
       }
       return total;
    }
}

public class Main {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        sumOfSums obj = new sumOfSums();
        System.out.println(obj.sumOfSumsOfDigits(val));
}
}

