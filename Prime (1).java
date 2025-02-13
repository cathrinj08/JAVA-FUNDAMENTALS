public class Prime
{
	public static void main(String[] args)
	{
		int n = 123456;
		int oddSum = 0;
		int evenSum = 0;
		int primeSum = 0;

		while (n > 0)
		{
			int digit = n % 10;
			n = n / 10;

			if (digit % 2 == 1)
			{
				oddSum += digit;
			}
			else
			{
				evenSum += digit;
			}
			if (checkPrime(digit))
			{
				primeSum += digit;
			}
		}
		System.out.println("Odd sum: " + oddSum + "\tEven sum: " + evenSum + "\tPrime sum: " + primeSum);
	}


	static boolean checkPrime(int val)
	{
		if (val <= 1) {
			return false;
		}


		for (int i = 2; i <= Math.sqrt(val); i++)
		{
			if (val % i == 0) {
				return false;
			}
		}

		return true;
	}
}
