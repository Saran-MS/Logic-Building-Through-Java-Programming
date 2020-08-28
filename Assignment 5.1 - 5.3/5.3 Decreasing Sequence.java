import java.util.*;

class decSequence 
{
    public void decreaseSequence(int arr[],int n)
    {
        int count=1;
        int max=0;
        int total = 0; 
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                count++;
            }
            else
            {
                if(count>1)
                {
                    total++;
                    if(count>max)
                    {
                        max=count;
                    }
                }
                count=1;
            }
        }
        System.out.println("Output1:"+total);
        System.out.println("Output2:"+max);
    }
}



public class Main{
    public static void main (String[] args) {
        int arr[] =  {11,3,1,4,7,8,12,2,3,7} ;
        int size = 10;
        decSequence obj = new decSequence();
        obj.decreaseSequence(arr,size);
    }
}


