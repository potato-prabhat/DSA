/*package whatever //do not write package name here */

class name {

	
	static int GCD(int a, int b)
	{ 
        int res = Math.min(a, b);
        if(a<b)
        {
        while(res!=0)
        {
            if(b%res==0 && a%res==0)
            return res;
            res--;
        }}
        return 1;
	}

    //based on eculidian approach
    static int GCD_smart(int a, int b)
	{   
        while(a!=b){
            if(a>b)
            a=a-b;
            else
            b=b-a;
        }
        return a;
	}

    //based on eculidian approach
    static int GCD_smart_optimized(int a, int b)
	{   if(b==0)
        return a;
        else
        return(GCD_smart_optimized(b, a%b));
	}





	public static void main (String[] args) {
		int x = 4, y = 6;
        System.out.println(GCD(x, y));
	}
}