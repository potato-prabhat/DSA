class Vr_find_missing_num_array {

    public static void vr_find_missing_num_array(int arr[], int n){
            int res=1;
        for(int i=0;i<n;i++){
            res = res^(i+2)^arr[i];
        }
        System.out.println(res);
    }

        public static void main(String[] args) {
                int [] arr = new int[]{1,3,4,6,5}; int n=5;

                vr_find_missing_num_array(arr,n);
            //find_odd_occurance_array_optimized(arr,n);
            
        }

    }