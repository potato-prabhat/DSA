class Count_set_bits {
    static int count_set_bits_naive(int n){
        int count =0;int x;

        while(n>0)
        {
            // if(n%2!=0)
            //     count++;
            //n=n/2;                // could be used
                
            // x=n&1;
            //if(x==1)
            //  count++;
            // n=n>>1;              //this could be used 

            count = count +(n&1);
            n=n>>1;                 //this could be used
        }
      
        return count;
    }

    public static void main(String[] args) {
        
    }
    
}
