/*package whatever //do not write package name here */

class LCM__of_numbers {

	
	static int lcm_of_numbers(int x,int y)
	{
        if(x%y==0)
        return y;
        else if(y%x==0)
        return x;

        //lcm = product of two numbers / hcf
        int HCF= hcf(x, y);
        return ((x*y)/HCF);
	}

    static int hcf(int a, int b){
        if(b==0)
        return a;
        else
        return hcf(b,a%b);
    }

    static int lcm_of_numbers_naive(int x, int y){
        int res = Math.max(x, y);
        while(res>=x||res>=y){
            if(res%x==0 && res%x==0)
            return res;
            res++;
        }
        return res;
    }
	public static void main (String[] args) {
        int a ,b;
        a=3; b=7;
		int lcm= lcm_of_numbers(a,b);
        System.out.println(lcm);
	}
}