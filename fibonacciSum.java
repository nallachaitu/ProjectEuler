public class fibonacciSum
{
	final static int limit = 4000000;
	public int EvenTermsSum(int firstTerm,int secondTerm) 
	{
		int sum = 0;
		int temp;
		int prev = firstTerm;
		int i = secondTerm;
		if(firstTerm % 2 ==0)
			sum += firstTerm;
		while(i < limit)
		{
			if(i % 2 == 0)
				sum = sum + i;
			temp = i + prev; 
			prev = i;
			i = temp;
		}
		return sum;
		
	}
	public static void main(String[] args)
	{
		fibonacciSum testClass = new fibonacciSum();
		int result = testClass.EvenTermsSum(1, 2);
		System.out.println(result);
	}


}