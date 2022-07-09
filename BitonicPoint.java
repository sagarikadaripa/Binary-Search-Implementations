/* Given an array arr of n elements which is first increasing and then may be decreasing, find the maximum element in the array.
Note: If the array is increasing then just print then last element will be the maximum value.

Example 1:

Input: 
n = 9
arr[] = {1,15,25,45,42,21,17,12,11}
Output: 45
Explanation: Maximum element is 45.
Example 2:

Input: 
n = 5
arr[] = {1, 45, 47, 50, 5}
Output: 50
Explanation: Maximum element is 50.

Input: 
n = 5
arr[] = {1, 2, 3, 4, 5}
Output: 5
Explanation: Maximum element is 5.


Input: 
n = 4
arr[] = {4, 3, 2, 1}
Output: 4
Explanation: Maximum element is 4.

*/

import java.io.*;

public class BitonicPoint {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaximum(arr, n);
            System.out.println(ans);
        }
    }
}

class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        int l = 0, h = n - 1;
        while(l <= h){
            int mid = l + (h - l)/2;
            if((mid== 0 || arr[mid] > arr[mid-1]) && (mid == n - 1 ||arr[mid] > arr[mid + 1]))
                return arr[mid];
            if(arr[mid] > arr[mid-1])
                l = mid + 1;
            else h = mid - 1;
        }
        return -1;
    }
}

