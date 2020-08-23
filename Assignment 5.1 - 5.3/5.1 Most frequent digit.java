import java.util.*;

class frequent {
    public int mostFrequentDigit(int input1,int input2,int input3,int input4)
    {
        int arr[] = {input1,input2,input3,input4};
        int index[] = new int[10];
        Arrays.fill(index,0);
        int maxval = -1,maxindex=0;
        for(int i=0;i<arr.length;i++)
        {
            int val = arr[i];
            while(val>0)
            {
                index[val%10]++;
                val/=10;
            }
               
        }
        for(int i=0;i<10;i++)
        {
            if(index[i]>maxval)
            {
                maxval = index[i];
                maxindex = i;
            }
        }
        return maxindex;
        
    }
}
public class Main{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int val1= s.nextInt();
        int val2= s.nextInt();
        int val3= s.nextInt();
        int val4= s.nextInt();
        frequent obj = new frequent();
        System.out.println(obj.mostFrequentDigit(val1,val2,val3,val4));
    }
}
