import java.util.*;

class sqrt
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solu obj = new Solu();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
		sc.close();
	}
}// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solu
{
     long floorSqrt(long x)
	 {
		// Your code here
		if(x == 1) return 1;
		long low = 1;
		long high = x/2;
		long ans = 0;
		while(low <= high){
		    long mid = low + (high - low)/2;
		    long sqr = mid * mid;
		    if(sqr < x){
		        ans = mid;
		        low = mid + 1;
		    }else if(sqr > x){
		        high = mid - 1;
		    }
		    else
		        return mid;
		}
		return ans;
	 }
    
}
