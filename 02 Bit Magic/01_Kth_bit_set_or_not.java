
class Kth_bit_set_or_not {
    static int kth_bit_set_or_not_naive(int n, int k){
        int flag =0;

        while(k>0)
        {
            if(n%2!=0&&k==1)
            {
                flag=1;
            }

            n=n/2;
            k--;
        }
        return flag;
    }

    static int kth_bit_set_or_not_optimized_left_shift(int n, int k){
        int num = n&(1<<(k-1));
        if(num!=0)
        return 1;
        else
        return 0;
    }

    static int kth_bit_set_or_not_optimized_right_shift(int n, int k){
        int num = 1&(n>>(k-1));
        if(num==1)
        return 1;
        else
        return 0;
    }

    public static void main(String[] args) {
        int n =5, k=2, flag1, flag2, flag3;
        flag1 = kth_bit_set_or_not_naive(n,k);
        flag2 = kth_bit_set_or_not_optimized_left_shift(n,k);
        flag3 = kth_bit_set_or_not_optimized_right_shift(n,k);
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
    }
}
