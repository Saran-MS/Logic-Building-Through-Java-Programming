import java.util.*;

class decode {
    public void findOriginal(int[] input1,int input2)
    {
        int sum=0,j=0;
        for(int i=input2-1;i>=0;i--)
        {
            input1[i] = input1[i]-input1[i+1];
            sum+=input1[i];
        }
        sum+=input1[input2];
        System.out.println("a[0] : "+input1[0]); 
        System.out.println("Sum: "+sum);
    }
}



public class Main{
    public static void main (String[] args) {
        int arr[] = {7,6,8,16,12,3};
        int size = 5;
        decode obj = new decode();
        obj.findOriginal(arr,size);
    }
}





