import java.util.Scanner;
public class StrongNumber{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num= in.nextInt();
        int sum=0,n=num;
        while(num>0)
        {
            int fact = 1;
            int digit = num%10;
            num = num/10;
            for(int i=1;i<=digit;i++)
            {
                fact *=i;
                
            }
            sum+=fact;
        }
        if(sum==n)
        {
            System.out.println("The given Number is Strong");
        }
        else{
                        System.out.println("The given Number is Not Strong");

        }
    }
}