class find_two_odd_appearing_occurance_in_array{

    static void Find_two_odd_appearing_occurance_in_array(int arr[], int n){
        System.out.print("result naive: ");
        
        for(int i=0; i<n; i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            if(arr[i]==arr[j])
            count++;
            if(count%2!=0)
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }

    static void Find_two_odd_appearing_occurance_in_array_optimized(int arr[], int n){
        int res1=0, res2=0, xor=0;
        for(int i=0; i<n;i++){
            xor=xor^arr[i];
        }
        int sm= xor&(~(xor-1));
        int temp;
        for(int i=0;i<n;i++){
            temp=arr[i]&sm;
            if(temp!=0)
                res1=res1^arr[i];
            else
                res2=res2^arr[i];
        }
        System.out.println("result optimized: "+res1+" "+res2);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,3,4,5,4,4,6,7,7};
        int n=10;

        Find_two_odd_appearing_occurance_in_array(arr,n);
        Find_two_odd_appearing_occurance_in_array_optimized(arr,n);
    }
}