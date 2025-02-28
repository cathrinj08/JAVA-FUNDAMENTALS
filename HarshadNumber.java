import java.util.Scanner;
public class HarshadNumber{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the start value");
        int start= in.nextInt();
        System.out.println("Enter the end value");
        int end= in.nextInt();
        
        for(int num=start+1;num<end;num++){
             int sum = 0, temp = num;

            
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (num % sum == 0) {
                System.out.println(num + " ");
            
        }
    }
}
}