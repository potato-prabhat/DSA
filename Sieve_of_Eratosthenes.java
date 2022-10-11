import java.util.Arrays;

public class Sieve_of_Eratosthenes {

    static int sieve_of_Eratosthenes_naive(int n){

        for(int i=2; i<=n; i++){
            if(check_for_prime_most_optimized_(i))
            System.out.println(i);
    }
        return 0;
    }

    static int sieve_of_Eratosthenes_optimized(int n){
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, true);
        int i,j;
        for(i=2; i*i<=n;i++)
        {
            if(arr[i]){
                for(j=i*2;j<=n;j=j+i)
                {
                    arr[j]=false;
                }
            }
        }

        for(i=2;i<=n;i++)
        {
            if(arr[i])
            System.out.println(i);
        }
        return 0;
    }

    static int sieve_of_Eratosthenes_optimized_max(int n){
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, true);
        int i,j;
        for(i=2; i<=n;i++)
        {
            if(arr[i]){
                System.out.println(i);
                for(j=i*i;j<=n;j=j+i)
                {
                    arr[j]=false;
                }
            }
        }


        return 0;
    }
    
    static boolean check_for_prime_most_optimized_(int y)
	{
        if(y==1)
        return false;
        if(y==2|| y==3)
        return true;

        if(y%2==0|| y%3==0)
        return false;
        
        for(int i=2; i*i<=y;i=i+6){
            if(y%i==0 || y%(i+2)==0)
            return false;
        }
        return true;
	}
    
    public static void main(String[] args){
        int x=20;
        // sieve_of_Eratosthenes_naive(x);
        // sieve_of_Eratosthenes_optimized(x);
        sieve_of_Eratosthenes_optimized_max(x);

    }
    
}
