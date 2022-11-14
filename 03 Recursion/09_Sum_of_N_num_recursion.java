class Sum_of_N_Natural_num_recursion {

    // Naive approach
        static int sum(int n){
            if(n==1)
            return 1;
            return n+sum(n-1);
        }

    

        public static void main(String[] args) {
            int a = sum(1);
            System.out.println(a);
        }
    
    
}
