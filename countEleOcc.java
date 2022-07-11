/* arr = 5 6 7 8 8 8 8 10
   idx = 0 1 2 3 4 5 6 7 
   target = 8
   LOGIC = last idx of 8 - starting idx of 8 + 1
*/

import java.util.*;
public class countEleOcc {
    public static int count(int arr[],int target){
        int left = BinarySearch(arr,target,true);
        if(left < 0)    return 0;
        int right = BinarySearch(arr,target,false);
        return right - left + 1;
    }
   public static int BinarySearch(int arr[],int target,boolean isLeftmost){
    int l = 0, h = arr.length - 1,idx = -1;
        while(l <= h){
            int mid = l + (h - l)/2;
            if(arr[mid] == target){
                idx = mid;
                if(isLeftmost)  
                    h = mid - 1;
                else
                    l = mid + 1;
            } 
            else if(arr[mid] < target)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return idx;
   }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array = ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key to search = ");
        int target = sc.nextInt();
        int ans = count(arr,target);
        System.out.println("result = "+ans);
        sc.close();
    }
}
