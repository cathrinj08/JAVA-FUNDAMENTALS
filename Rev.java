import java.util.*;
public class Rev
{
	public static void main(String[] args)
	{
		Scanner  in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = in.nextInt();
		int rev = 0;
		while(n!=0)
		{
			int digit = n% 10;
			n = n/10;
			rev=rev*10+digit;
		}
		System.out.println(rev);
	}
}