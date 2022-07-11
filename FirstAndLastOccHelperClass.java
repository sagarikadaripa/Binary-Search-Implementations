import java.util.*;
public class FirstAndLastOccHelperClass {
    public static int getFirstOcc(int arr[],int n,int k,boolean isFirst){

        int l = 0;
        int h = n - 1;
        int result = -1;
        while(l <= h){
            int mid = l + (h - l)/2;
            if(arr[mid] > k){
                h = mid - 1;
            }
            else if(arr[mid] < k){
                l = mid + 1;
            }
            else{
                if(isFirst){  // since isFirst is true as we want the the first occurence of the element so our searching will automatically from the left side of the mid
                    h = mid - 1; // so l value will be the same i.e 0  but the h value will have to change. As the search will be on the left side of the middle element the h value becomes mid-1
                }
                else{
                    l = mid + 1;
                }
                result = mid;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array = ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements of the array = ");
            for(int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the key = ");
            int k = sc.nextInt();
            boolean isFirst = true;
            System.out.println(getFirstOcc(arr,n,k,isFirst));
        }
    }
}
