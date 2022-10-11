class Trailing_zeros_in_factorial_of_num {
    
    static int trailing_zeros_in_factorial_of_num(int x)
	{
        long res = 1;
        int count = 0;
        for(int i=1;i<=x; i++)
        {
            res=i*res;
        }
        System.out.println(res);
        while(res%10==0){
            count++;
            res=res/10;
        }
        return count;
	}

    static int trailing_zeros_in_factorial_of_num_smart(int x)
	{
        int res = 0;
        for(int i=5;i<=x; i=i*5)
        {
            res= res + x/i;
        }
        return res;
	}

	public static void main (String[] args) {
		
		int number = 251;

		// System.out.println(trailing_zeros_in_factorial_of_num(number));
        System.out.println(trailing_zeros_in_factorial_of_num_smart(number));

	}
}
