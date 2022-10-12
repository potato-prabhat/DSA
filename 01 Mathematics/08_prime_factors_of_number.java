class prime_factors_of_number {
    static int Prime_factors_of_number(int x)
	{int temp=x;
        for(int i=2;i*i<=x;i++){
            //System.out.println("here4");
            if(check_for_prime_most_optimized_(i)){
               // System.out.println("here1");
                while(temp%i==0)
                {
                temp=temp/i;
                System.out.println(i);}
            }
            temp=x;
        }

        return 0;
	}

    static int Prime_factors_of_number_optimized(int x)
	{ 
        if(x<=1) return 0;
        for(int i=2; i*i<=x;i++)
        {
            while(x%i==0){
                System.out.println(i);
                x=x/i;
            }
        }
        if(x>1)
        System.out.println(x); 
        return 0;
	}
static int Prime_factors_of_number_most_optimized(int n){
    if(n<=1) return 0;
    while(n%2==0){
        System.out.println(2); n=n/2;
    }
    while(n%3==0){
        System.out.println(3); n=n/3;
    }
    for(int i=5; i*i<=n; i=i+6)
    {
        while(n%i==0)
        {System.out.println(i); n=n/i;}
        while(n%(i+2)==0)
        {System.out.println(i+2); n=n/(i+2);}
    }
    if(n>3)
    System.out.println(n);
    return 0;
}
    static boolean check_for_prime_most_optimized_(int y)
	{
        if(y==1)
        return false;
        if(y==2|| y==3)
        return true;

        if(y%2==0|| y%3==0)
        return false;
        
        for(int i=2; i*i<=y;i=i+6){
            if(y%i==0 || y%(i+2)==0)
            return false;
        }
        return true;
	}

	public static void main (String[] args) {
		int n=195;
  //Prime_factors_of_number(n);
  //Prime_factors_of_number_optimized(n);
  Prime_factors_of_number_most_optimized(n);
	}
}
