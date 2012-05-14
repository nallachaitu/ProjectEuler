// The program computes the first Triangular number which has more than 500 divisors
//Nth Triangular can be computed by n*(n+1)/2-->just the sum of the natural numbers from  1 to n. 

public class firstTriNumber
{
	boolean[] generatePrimes(int limit)
	{
		boolean[] isPrime = new boolean[limit+1];
		for(int i=0;i<=limit;i++)
		{
			isPrime[i] = true;
		}
		for(int i=2;i<=limit;i++)
		{
			for(int j=i;i*j <= limit;j++)
			{
				int multiple = i*j;
				if(isPrime[multiple])
					isPrime[multiple] = false; 
				
			}
			
		}
		return isPrime;
	}
	//returns the triangular number that has more than noOfDivisors parameter.
	public long getTriNum(int noOfDivisors) 
	{
		int i = 3;
		int count = 0;
		int multiple = 10;
		boolean[] primes = generatePrimes(noOfDivisors*multiple+1); 
		long nextTriNum = 3;
		while(nextTriNum < Integer.MAX_VALUE)
		{
			count = getDivisorsCount(nextTriNum,primes);
			if(count > noOfDivisors)
			{
				return nextTriNum;
			}
			else if(count == -1)//need to generate more primes than current ones
			{
				multiple = multiple * 5;
				primes = generatePrimes(noOfDivisors*multiple+1);
			}
			else
			{
				nextTriNum = (i * (i+1))/2;
				i++;
			}
		}
		return -1;//such number doesnot exist with in the range
	}
	
	public  int getExponent(long num , int prime)
	{
		int divisor = prime;
		int count = 0;
		while(num / divisor !=0)
		{
			count++;
			divisor = divisor * prime;
		}
		return count;
		
	}
	//returns the count of the divisors of a numbers 
	//or returns -1 if the parameter primes are insufficient to represent the number
	public int getDivisorsCount(long num,boolean[] primes)
	{
		int i;
		boolean flag = false;
		int exp = 0;
		int count = 1;
		for(i=2;i<primes.length && !flag;i++)
		{
			if(primes[i])
			{
				if(num / i ==0)
					flag=true;
				exp = getExponent(num , i);
				count *= (exp+1);
			}
		}
		if(flag)
		{
			return count;	
		}
		
		else 
		{
			return -1;
			
		}
	}

	public static void main(String[] args)
	{
		firstTriNumber testClass = new firstTriNumber();
		long result = testClass.getTriNum(500);
		System.out.println("required Number : " + result);
	}

}