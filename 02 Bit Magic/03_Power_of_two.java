class Power_of_two {
    public static boolean power_of_two_naive(int n){
        if(n<=0)
        return false;
        while(n!=1){
            if(n%2!=0)
            return false;

            n=n/2;
        }
        return true;
    }
    public static boolean power_of_two_optimized(int n){
        int x=n&(n-1);
        return (n>0&&x==0);
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(power_of_two_naive(n));
        System.out.println(power_of_two_optimized(n));
    }
}
