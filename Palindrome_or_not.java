
class Palindrome_or_not {

	
	static int palindromeChecker(int x)
	{
		// int res = 0; int temp=0,txt = x;
        // int i=0;

        // while(txt>0){
        //     txt=txt/10;
        //     i++;
        // }

        // txt=x;
        // i--;
		// while(txt > 0)
		// {
		// 		temp = txt % 10;
        //         txt = txt/10;
		// 		res=res+temp*((int)Math.pow(10,i));
        //         i--;
		// }	
        // if(x==res)
		// return 1;
        // else
        // return 0;
        
// better approach
        int rev=0, temp=x , a;
            
        while(temp>0){
            a= temp%10;
            rev = rev*10 + a;
            temp=temp/10;
        }
        if(rev==x)
        return 1;
        else
        return 0;
	}

	public static void main (String[] args) {
		
		int number = 551;
        int y = palindromeChecker(number);

		System.out.println(y);

	}
}