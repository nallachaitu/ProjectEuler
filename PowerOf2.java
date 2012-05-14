public class PowerOf2
{
	public long compute(int pow)
	{
		long sum = 1;
		int limit;
		boolean isEven = (pow % 2 == 0);
		if(isEven)
			limit = pow / 2 - 1;
		else
			limit = pow / 2;
		for(int i=1;i <= limit;i++)
		{
			sum += combinations(pow,i);
		}
		if(isEven)
			return 2*sum + combinations(pow,pow/2);
		
		return 2*sum; 
	}
	
	public long combinations(int n,int k)//nck
	{
		if(k==0 || n==k)
			return 1;
		long i=1L;
		long product = (long)1L * n;
		long fact = 1L;
		for(;i<k;i++)
		{
			product *= n-i;
			fact *= i;
		}
		fact *= k;
		return product / fact ;
	}
	
	
	public static void main(String args[])
	{
		PowerOf2 test = new PowerOf2();
		long result = test.compute(10);
		System.out.println("Result : " + result);
	}
}