/*package whatever //do not write package name here */

class check_for_Prime {

	
	static boolean check_for_prime(int x)
	{
        if(x==1)
        return false;
        if(x==2|| x==3 || x==5 || x==7)
        return true;

        if(x%2==0|| x%3==0)
        return false;
        for(int i=2; i<Math.sqrt(x);i++){
            if(x%i==0)
            return false;
        }
        return true;
	}

    static boolean check_for_prime_most_optimized(int x)
	{
        if(x==1)
        return false;
        if(x==2|| x==3 || x==5 || x==7)
        return true;

        if(x%2==0|| x%3==0)
        return false;
        
        for(int i=2; i*i<=x;i=i+6){
            if(x%i==0 || x%(i+2)==0)
            return false;
        }
        return true;
	}

	public static void main (String[] args) {
		
        int a=4;
        
        System.out.println(check_for_prime(a));

	}
}