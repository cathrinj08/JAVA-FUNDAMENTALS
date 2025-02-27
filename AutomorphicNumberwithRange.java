import java.util.Scanner;
public class AutomorphicNumberwithRange{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the start value");
        int start = in.nextInt();
        System.out.println("Enter the end value");
        int end = in.nextInt();
        System.out.println("The Automorphic Numbers from "+ start + "to "+end);

        for (int num=start;num<=end;num++)
        {

        int square = num*num;
        int digit = String.valueOf(num).length();
        int lastdigit =square%(int) Math.pow(10,digit);

        if (lastdigit == num)

        {

            System.out.println(num);
        }
        }
    }
}