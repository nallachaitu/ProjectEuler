//the program computes the product of the values of the Pythogorean triplet whose sum is equal to the limit like 1000

public class pythTriplet
{
	public int productOfTriplet(int limit)
	{
		int sumOfSquares = 0;
		for(int i=1;i<limit-1;i++)
		{
			for(int j=1;j<limit-1;j++)
			{
				if(i+j>limit-2 )
					break;
				for(int k=1;k<limit-1;k++)
				{
					if(i+j+k == limit)
					{
						sumOfSquares = i*i + j*j;
						if(k*k == sumOfSquares)
							return i*j*k;
					}
				}
				
				
			}
			
			
		}
		
		return -1;	

	}
public static void main(String args[])
{
	pythTriplet testClass = new pythTriplet();
	int result = testClass.productOfTriplet(1000);
	System.out.println(result);
}


}