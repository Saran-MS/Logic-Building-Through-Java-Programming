import java.util.*;

public class Main{
    public int pin(String s)
    {
        int total=0;
        String[] words= s.split(" ");
        for(int i=0;i<words.length;i++)
        {
            total+=words[i].length();
        }
        if(total>9)
        {
            int sum=0;
            while(total!=0)
            {
                sum+=total%10;
                total/=10;
            }
            total=sum;
        }
        return total;
    }
    
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        Main obj = new Main();
        System.out.println(obj.pin(str));
    }
}

