class Find_odd_occurance_array {

    public static void find_odd_occurance_array_naive(int arr[], int n){

        for(int i=0;i<n;i++){
            int count =0 ;
            for(int j=0;j<n;j++)
            if(arr[j]==arr[i])
            count++;
            if(count%2!=0)
            System.out.println(arr[i]);
        }
    }

        public static void find_odd_occurance_array_optimized(int arr[], int n){
            int res = 0;

            for(int i=0; i<n;i++)
            res=res^arr[i];

            System.out.println(res);
        }

        public static void main(String[] args) {
                int [] arr = new int[]{1,1,3,3,4}; int n=5;

            find_odd_occurance_array_naive(arr,n);
            //find_odd_occurance_array_optimized(arr,n);
            
        }

    }