/*package whatever //do not write package name here */

class Count_Digits {

	
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
		
		int number = 324349;

		System.out.println(countDigits(number));

	}
}