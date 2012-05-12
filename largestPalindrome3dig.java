/*Program for computing the largest palindrome for the product of 
2 three digit numbers*/
public class largestPalindrome3dig
{
	String str;
	public long getLargestPalin()
	{
		long maxProduct = -1;
		for(int i=999;i > 500;i--)
		{
			for(int j=999;j > 500;j--)
			{
				str = String.valueOf(i*j);
				if(isPalindrome(str))
					if(i*j > maxProduct)	
						maxProduct = i*j;
			}
		}
		if(maxProduct == -1){ // searching the first half if palindrome is not found in the last half
		for(int i=499;i > 101;i--)
		{
			for(int j=499;j > 101;j--)
			{
				str = String.valueOf(i*j);
				if(isPalindrome(str))
					if(i*j > maxProduct)	
						maxProduct = i*j;
			}
		}
		}
		return maxProduct;//no such palindrome exist.
		
	}

	public boolean isPalindrome(String str)
	{
		int i=0,j=str.length()-1;
		for(;i<j;i++,j--)
		{
			if(str.charAt(i) != str.charAt(j))
				return false;
			
		}
		return true;
	}
	public static boolean compare()
	{
		String first = "hello";
		String second = "jene";
		return (first.charAt(1) == second.charAt(2));
	}
	public static void main(String args[])
	{
		largestPalindrome3dig test = new largestPalindrome3dig();
		long result = test.getLargestPalin();
		System.out.println("Largest Palindrom for 3 digits is : " + result);
	}
}