class print_1_to_N_recursion {

    // This recursion function is not a Tail recursion
        static void fun(int n){
            if(n==0)
            return;
            fun(n-1);
            System.out.println(n);
        }

    // This is a tail recursion function
    static void fun2(int k, int n){
        if(n==0)
        return;
        System.out.println(k);
        fun2(k+1,n-1);
    }

         public static void main(String[] args) {
            fun(10);
            fun2(1,10);
         }
    }
    

