import java.util.*;

class add{
    int addLastDigits(int input1,int input2)
    {
        return Math.abs(input1%10)+ Math.abs(input2%10);
    
    }
}

class Main{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int val1 = s.nextInt();
        int val2 = s.nextInt(); 
        add obj = new add();
        System.out.println(obj.addLastDigits(val1,val2));
    }
}


