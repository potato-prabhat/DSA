
class Power_of_num{
    static int power_of_num_naive(int a, int b){
        int res=1;

        for(int i=0; i<b; i++)
        {
            res=res*a;
        }
        return res;
    }

    static int power_of_num_optimized_recursive(int a, int b){
        if(b==0)
        return 1;

        int temp = power_of_num_optimized_recursive(a, b/2);
        temp=temp*temp;
        if(b%2 == 0)
        return temp;
        else
        return temp*a;
    }
    static int power_of_num_optimized_max_iterative(int a, int b){
        int res =1;  
        while(b>0)
            {
                if(b%2!=0)
                {
                    res= res*a;
                }
                //Bit is 1

                b=b/2;
                a=a*a;

            }

            return res;
    }
    public static void main (String [] args){
        int x=2, y=12;
        int pow;
        // pow = power_of_num_naive(x,y);
        // pow = power_of_num_optimized_recursive(x,y);
        pow = power_of_num_optimized_max_iterative(x,y);
        System.out.println(pow);
    }
}