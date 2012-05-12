//The program computes largest primeFactor for any given number

public class largestPrimeFactor
{
	public boolean isPrime(long num)
	{
		long i = 2;
		if(num == 1 || num == 0)
			return false;
		for(;i<num/2;i++)
		{
			if(num % i == 0)
				return false;
		}
		
		return true;
	}
	public long getLargestPrime(long num)
	{	
		int i=2;
		long currPrime = -1;
		long dividend = num;
		while(i <= num && dividend > 1)
		{
			if(dividend % i == 0)
			{
				dividend = dividend / i ;
				if(isPrime(i))
					currPrime = i;
			}
			i++;
		}
		return currPrime;
	}
	public static void main(String[] args)
	{
		long number = 600851475143L;
		largestPrimeFactor test = new largestPrimeFactor();
		long result = test.getLargestPrime(number);
		System.out.println("The largest Prime Factor : " + result);
	}





}