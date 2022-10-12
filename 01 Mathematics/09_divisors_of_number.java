class divisors_of_number {
    static int Divisors_of_number(int x)
	{
        for(int i=1;i<=x;i++)
        {if(x%i==0)
        System.out.println(i);}
        return 0;
	}

    static int Divisors_of_number_optimized_unordered(int x)
	{
        for(int i=1;i*i<=x;i++)
        {if(x%i==0)
        System.out.println(i);
        if((x/i)!=i)
        System.out.println(x/i);}
        return 0;
	}
    static int Divisors_of_number_optimized_ordered(int x)
	{int i=1;
        for(;i*i<x;i++)
        {if(x%i==0)
        System.out.println(i);}
        
        for(;i*i>=1;i--)
        {
        if(x%i==0)
        System.out.println(x/i);}
        return 0;
	}
	public static void main (String[] args) {
		int a =320;

        Divisors_of_number_optimized_ordered(a);
        Divisors_of_number_optimized_unordered(a);
        Divisors_of_number(a);
    	}
    
}
