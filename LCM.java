/*package whatever //do not write package name here */

class name {

	
	static int LCM(int x,int y)
	{
        if(x%y==0)
        return y;
        else if(y%x==0)
        return x;

        //lcm = product of two numbers / hcf
        int HCF= hcf(x, y);
System.out.println(HCF);
        return ((x*y)/HCF);
	}

    static int hcf(int a, int b){
        if(b==0)
        return a;
        else
        return hcf(b,a%b);
    }

	public static void main (String[] args) {
        int a ,b;
        a=3; b=7;
		int lcm= LCM(a,b);
        System.out.println(lcm);
	}
}