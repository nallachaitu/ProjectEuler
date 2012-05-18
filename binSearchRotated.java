public class binSearchRotated
{
	public int binSearch(int[] array,int low,int high,int key)
	{
		if(low > high)
			return -1;
		int mid = (low + high)/2;
		if(key == array[mid])
			return mid;
		else if(key > array[mid])
		{
			if(key > array[high])
				return binSearch(array,low,mid-1,key);
			else
				return binSearch(array,mid+1,high,key);
		}
		else 
		{
			if(key < array[low])
				return binSearch(array,mid+1,high,key);
			else
				return binSearch(array,low,mid-1,key);
		}
		
	}
	public static void main(String[] args)
	{
		binSearchRotated test = new binSearchRotated();
		int[] array = {5,6,1,2,3,4};
		int result = test.binSearch(array, 0, array.length-1, 3);
		System.out.println("Result is: " + result);
	}


}