    /*     
        N = 5
        arr[] = {4 ,5 ,1 ,2 ,3}
        Output: 1
        Explanation: 1 is the minimum element inthe array.
        Example 2

        Input:
        N = 7
        arr[] = {10, 20, 30, 40, 50, 5, 7}
        Output: 5
        Explanation: Here 5 is the minimum element.

EDGE CASES
   1    Input:
        N = 2
        arr[] = {2,1}
        Output: 1
        Case Explanation: mid is 0 but the element next to mid is the smallest ie mid + 1 is smallest .

    2   Input:
        N = 5
        arr[] = {1,2,3,4,5}
        Output: 1
        Case Explanation: Here the array is sorted so the 1st element i.e. the first element is the smallest.
   */

   /* Observations - 
        The smallest element will always be on the unsorted part of the array.
        element before the smaller element will be greater than that
    */

import java.util.*;

public class minEleInRotatedArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            
            Solutions sol = new Solutions();
            System.out.println(sol.findMin(A, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solutions
{
    int findMin(int arr[], int n)
    {
        //complete the function here
        int l = 0, h = n - 1;
        while(l <= h){
            int mid = l + (h - l)/2;
            
            if(mid == 0 && arr[mid] > arr[mid + 1] )  // for EDGE CASE 1
                return arr[mid+1];
            if(mid == 0 || arr[mid - 1] > arr[mid] ) //mid == 0 is for EDGE CASE 2
                return arr[mid];
            //smallest element will always be present at the unsorted part of the array
            //checking if the rightmost part is unsorted or not
            if(arr[mid] > arr[h]){
                l = mid + 1;
            }
            //checking if the leftmost part is unsorted or not
            else if(arr[l] > arr[mid]){
                h = mid - 1;
            }
            else
                return arr[l]; //if the array is sorted then return the first element
        }
        return -1;
    }
}

