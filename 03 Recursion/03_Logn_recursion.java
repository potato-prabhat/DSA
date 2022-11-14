
// Fun1 returns Log2(n) when n is a power of two
//In general it returns base(Log2(n))
class Recursion_op_practice_03 {

    // Fun1 returns Log2(n) when n is a power of two
//In general it returns base(Log2(n))
    static int fun1(int n){
        if (n==1)
        return 0;

        else
        return 1+fun1(n/2);
    }

    //In general Fun2 returns base(Log3(n))
    static int fun2(int n){
        if (n<3)
        return 0;

        else
        return 1+fun2(n/3);
    }
    
    public static void main(String[] args) {
        int x = fun1(16);
        System.out.println(x);
    }
}
