import java.util.*;

class pin
{
    public int generate(int val1,int val2,int val3)
    {
        int arr[]={val1,val2,val3};
        int hundreds=0,tens=0,ones=0;
        int min1=10,min10=10,min100=10,max=0;
        for(int i=0;i<3;i++)
        {
            int temp=arr[i];
            while(temp!=0)
            {
                int r=temp%10;
                if(r>max)
                    max=r;
                temp/=10;
            }
        }
    
        for(int i=0;i<3;i++)
        {
            int temp = arr[i]/100;
            if(temp<min100)
            {
                min100 = temp;
                hundreds = min100;
            }
        }
        for(int i=0;i<3;i++)
        {
            int temp = (arr[i]/10)%10;
            if(temp<min10)
            {
                min10 = temp;
                tens = min10;
            }
        }
        for(int i=0;i<3;i++)
        {
            int temp = arr[i]%10;
            if(temp<min1)
            {
                min1 = temp;
                ones = min1;
            }
        }
        return (max*1000)+hundreds*100+tens*10+ones;
    
    }
    
}

public class Main{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int val1 = s.nextInt();
        int val2 = s.nextInt();
        int val3 = s.nextInt();
        pin obj = new pin();
        if((val1>=100 && val1<=999) && (val2>=100 && val2<=999) && (val3>=100 && val3<=999))
        {
            System.out.println("PIN = "+obj.generate(val1,val2,val3));
        }
        else
        {
            System.out.println("Enter the inputs in 3 digits");
        }
}
}