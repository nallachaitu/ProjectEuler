public class multiplesof3or5
{
	
	//It computes the sum of multiples of 3 or 5
	public int multiplesof3or5Sum(int limit)
	{
		int sum = 0;
		for(int i=1;i < limit;i++)
		{
			if(i % 3 == 0)
				sum += i;
			else if(i % 5 == 0)
				sum += i;
			
		}
		return sum;
		
	}
	
	public static void main(String[] args)
	{
		multiplesof3or5 testClass = new multiplesof3or5();
		int result;
		result = testClass.multiplesof3or5Sum(1000);
		System.out.println(result);
	}
	

}