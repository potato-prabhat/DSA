class power_set_using_bitwise{

    static void Power_set_using_bitwise(String str){
        int n= str.length(); int x;
        int nPow = (int)Math.pow(2, n);

        for(int i=0; i<nPow; i++){

            for(int j=0; j<n;j++){
                x=i&(1<<j);
                if(x!=0)
                System.out.print(str.charAt(j));
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Power_set_using_bitwise("abc");
    }
}