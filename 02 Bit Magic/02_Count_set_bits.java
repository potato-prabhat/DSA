

class Count_set_bits {
    static int count_set_bits_naive(int n){
        int count =0;

        //int x;
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

    static int count_set_bits_brian_kernigam_method(int n)
    {
        int res=0;
        while(n>0)
        {
            n=(n&(n-1));
            res++;
        }
        return res;
    }

    static int count_set_bits_lookup_table_method(int n)
    {
        int[] table= new int[256];
        int res;
        //Arrays.fill(table, 0);

        for(int i=0; i<256;i++)
        {
            table[i] = (i&1) + table[i/2];
        }

        res = table[n&0xff];
        n=n>>8;
        res = res+ table[n&0xff];
        n=n>>8;
        res = res+ table[n&0xff];
        n=n>>8;
        res = res+ table[n&0xff];

        return res;

    }

    public static void main(String[] args) {
        int x=100000;
        System.out.println(count_set_bits_naive(x));
        System.out.println(count_set_bits_brian_kernigam_method(x));
        System.out.println(count_set_bits_lookup_table_method(x));
    }
    
}
