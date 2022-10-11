/*package whatever //do not write package name here */

class Factorial_of_num {

	
	static int Factorial_of_Num(int x)
	{   
        int res = 1;
        for(int i=1;i<=x; i++)
        {
            res=i*res;
        }
        return res;
	}
	static int Factorial_of_Num_recursive(int x)
	{   
        if(x==0)
        return 1;

        return (x*Factorial_of_Num_recursive(x-1));
	}

	public static void main (String[] args) {
        int number = 3;
		System.out.println(Factorial_of_Num(number));
        System.out.println(Factorial_of_Num_recursive(number));
	}
}