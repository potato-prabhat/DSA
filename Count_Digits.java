/*package whatever //do not write package name here */

class GFG {

	
	static int countDigits(int x)
	{
		int res = 0;

		while(x > 0)
		{
				x = x / 10;

				res++;
		}	

		return res;
	}

	public static void main (String[] args) {
		
		int number = 324424349;

		System.out.println(countDigits(number));

	}
}