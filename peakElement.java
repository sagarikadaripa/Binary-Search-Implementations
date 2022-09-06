
import java.util.*;
class peakElement{
	public static int peakEle(int[] arr,int n)
    {
        int l = 0, h = n - 1;
        int mid = 0;
        while(l <= h){
            mid = l + (h - l)/2;
            if((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == n-1 ||arr[mid] > arr[mid + 1]))
                return arr[mid];
            if(mid > 0 && arr[mid] <= arr[mid -1]) h = mid - 1;
            else l = mid + 1;
        }
        return arr[mid];
    }
	public static void main(String[] args){
		// int arr[] = {91,63,63,42,33,3,-15,-31,-36,-54,-68,-92};
		int arr[] = {1,2};

		int ans = peakEle(arr,arr.length);
		    
		System.out.println(ans);
	}
}

	


