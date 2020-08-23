import java.util.*;

class palindrome{
    public int isPalinNumPossible(int input)
    {
        int arr[] = new int[10];
        Arrays.fill(arr,0);
        int count=0;
        while(input>0)
        {
            arr[input%10]++;
            input/=10;
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i]%2!=0)
            {
                count++;
            }
        }
        if(count==1)
        {
            return 2;
        }
        else
        {
            return 1 ;
        }
        

    }
}

public class Main {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        palindrome obj = new palindrome();
        System.out.println(obj.isPalinNumPossible(val));
}
}

