// problem 14 in Project Euler. Element that leads to longest sub chain
public class collatzProblem
{
	long[] array = new long[1000000];
	public long getLongestChain2(int limit)
	{
		long count= 0;
		array[2] = 1;
		array[1] = 1;
		long next = 0;
		long maxCount = 0;
		int maxNum = 0;
		for(int i=3;i<limit;i++)
		{
			System.out.println(i);
			next = i;
			count = 0;
			while(next != 1)
			{
				if(next < limit && array[(int)next] != 0)
				{
					count += array[(int)next];
					break;
				}
				if(next % 2 ==0)
					next = next / 2;
				else
					next = 3 * next + 1;
				count++;
			}
			if(count > maxCount)
			{
				maxNum = i;
				maxCount = count;	
			}
			if(array[i] == 0 && i < limit)
				array[i] = count;
		}
		return maxNum;
		
	}
	public long getLongestChain(int limit)
	{
		int sum = 0;
		if(limit == 2)
		{
			array[limit] = 1;
			return 1;
		}
		if(array[limit] != 0)
			return array[limit];
		else if(limit % 2 == 0)
		{
			if(array[limit/2] != 0)
				sum += array[limit/2];
			else
				sum += getLongestChain(limit/2);	
		}
		else
		{
			if(array[3*limit + 1] != 0)
				sum += array[3*limit + 1];
			else
				sum += getLongestChain(3*limit + 1);
			
		}
		array[limit] = sum;
		return sum;
	}
	public long getLongestChainInAll(int bound)
	{
		long result;
		long max = 0;
		for(int i=1;i<bound;i++)
		{
			result = getLongestChain(i);
			if(result > max)
				max = result;
		}
		return max;
	}
	public static void main(String[] args)
	{

		collatzProblem testClass = new collatzProblem();
		long result = testClass.getLongestChain2(1000000);
		System.out.println("result : " + result);
	}
	
}