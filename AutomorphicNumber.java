import java.util.Scanner;
public class AutomorphicNumber{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = in.nextInt();
        int square = num*num;
        int digit = String.valueOf(num).length();
        int lastdigit =square%(int) Math.pow(10,digit);
        if (lastdigit == num)
        {
                    System.out.println("The given number is a Automorphic Number");

        }
        else{
                    System.out.println("The given number is not a Automorphic NUmber");

        }
    }
}