/*      Input:
        N = 9
        A[] = {5 6,7,8,9,10,1,2,3}
        K = 10
        Output: 5
        Explanation: 10 is found at index 5. 
*/
import java.io.*;
import java.util.*; 

class rotatedArrayEleSearch{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        	{
        		array[i] = sc.nextInt();
        	}
        	int target = sc.nextInt();

            Solution ob = new Solution();
			System.out.println(ob.Search(array,target));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    public static int Search(int array[], int target)
	{
	    int l = 0, h = array.length - 1;
	    while(l <= h){
	        int mid = l + (h - l)/2;
	        if(array[mid] == target) return mid;
			//[3,1] target = 1 
	         //leftmost side is sorted <= because lets say mid = 0 
	         if(array[l] <= array[mid]){
    	         if(array[l] <= target && target < array[mid]){
    	             h = mid - 1;
    	         }
    	         else{
    	             l = mid + 1;
    	         }
	         }
	         //rightmost part is sorted
	         else
	         {
	             if(array[mid] < target && target <= array[h]){
	                 l = mid + 1;
	             }
	             else
	             {
	                 h = mid - 1;
	             }
	         }
	    }
	    return -1;
	}
} 


