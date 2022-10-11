
class Kth_bit_set_or_not {
    static int kth_bit_set_or_not_naive(int n, int k){
        int flag =0;

        while(k>=0)
        {
            if(n%2!=0&&k==0)
            {
                flag=1;
            }

            n=n/2;
            k--;
        }
        return flag;
    }
    public static void main(String[] args) {
        int n =2, k=2, flag;
        flag = kth_bit_set_or_not_naive(n,k);
        System.out.println(flag);
    }
}
