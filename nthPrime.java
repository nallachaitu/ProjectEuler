//Program Computes the Nth Prime Number

public class nthPrime
{
	public long getnthPrime(int n)
	{
			int num = 2 ;  
			int flag = 1;//whether a number is prime or not for particular iteration
			int count=0;//number of primes upto the current iteration.
			for(; count !=n;num++,flag=1)
			{
				for(int i=2;i<=num/2;i++)
				{
					if(num % i == 0)
					{
						flag = 0;
						break;
					}
				}
				if(flag == 1)
				{
					count++;
				}
			}
		return num-1;
		
	}
	
	public static void main(String[] args)
	{
		nthPrime test = new nthPrime();
		long result = test.getnthPrime(10001);
		System.out.println("Nth Prime : " + result);
	}
	
}