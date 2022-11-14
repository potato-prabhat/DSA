class factorial_recursion {
    static int fact(int n){
        if(n==0) // not the base case n==0 and not n==1
                //as n>=0 and if the base case was n==1
                // n=0 the recursion will go into -ve
                // output will be stack overflow exception
        return 1;
        return n*fact(n-1); // Note this is not a tail recursion
    }

    // Note fact2 is a tail recursion function
    static int fact2(int n, int k){
        if(n==0||n==1)
        return k;
        return fact2(n-1,k*n);
    }
public static void main(String[] args) {
    int a = fact(5);
    int b = fact2(5,1);
    System.out.println(a);
    System.out.println(b);
}
}
