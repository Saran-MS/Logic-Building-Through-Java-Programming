import java.util.*;

class repeat{
    public int NumberRepeat(int arr[],int n)
    {
        Arrays.sort(arr);
        int count=1,max=-1,result =arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
            {
                count++;
            }
            else
            {
                if(count>max)
                {
                    max = count;
                    result = arr[i-1];
                }
                count=1;
            }
            
        }
        return result;
    }
}


public class Main{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        repeat obj = new repeat();
        System.out.println(obj.NumberRepeat(arr,size));
    }
}

