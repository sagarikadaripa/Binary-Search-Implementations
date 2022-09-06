public class MatrixEleSearch {
    public static boolean binarySearch(int arr[][],int k,int row,int col){
        int l = 0, h = row - 1;
        while(l <= h){
            int mid = l + (h - l)/2;
            if(arr[mid][0] <= k && arr[mid][col-1] >= k){
                int inner_low = 0, inner_high = col - 1;
                while(inner_low <= inner_high){
                    int inner_mid = inner_low + (inner_high - inner_low)/2;
                    if(arr[mid][inner_mid] == k) return true;
                    else if(arr[mid][inner_mid] < k) inner_low = inner_mid + 1;
                    else inner_high = inner_mid - 1;
                }
                return false;
            }else if(arr[mid][0] > k){
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return false;
    }

    public static void main(String args[]){ 
        int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int k = 34;
        boolean b = binarySearch(arr,k,3,4);
        System.out.println(b);
    }
}
