/*
 *  the program computes all possible path counts to reach bottom corner point through square matrix intersectionpoints 
*/

public class pathsCount
{
	public int size=20;
	long[][] array = new long[21][21];
	public void printArray(long[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	public long getCount(int x,int y)
	{
		long sum = 0;
		if(x>size || y>size)
			return 0;
		if(x==size && y==size)
		{
			array[size][size] = 0;
			return 0;
		}
		if(x+1<=size)
		{
			if(array[x+1][y] == 0)
			{
				if(x+1==size && y==size)
				{
					array[x][y] = 1;
					sum =1;
					return sum;
				}
				else
					sum += getCount(x+1,y);
			}
			else
				sum += array[x+1][y];
		}
		if(y+1<=size)
		{
			if(array[x][y+1] == 0)
			{
				if(x==size && y+1==size)
				{
					array[x][y] = 1;
					sum = 1;
					return sum;
				}
				else
				sum += getCount(x,y+1);
			}
			else 
				sum += array[x][y+1];
		}
		array[x][y] = sum;
		return sum;
	}
	public static void main(String[] args)
	{
		pathsCount test = new pathsCount();
		long result = test.getCount(0,0);
		System.out.println(result);
		test.printArray(test.array);
	}

}
