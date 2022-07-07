import java.util.*;
public class fisrtAndLastOcc {

    ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> list = new ArrayList<Long>();
        //finding the first
        int l = 0;
        int h = n - 1;
        long first = -1, last = -1;
        while(l <= h){
            int mid = l + (h - l)/2;
            if(arr[mid] > x){
                h = mid - 1;
            }
            else if(arr[mid] < x){
                l = mid + 1;
            }
            else{
                first = mid;
                h = mid - 1;
            }
        }
        //finding the last index
        l = 0; h = n - 1; 
        while(l <= h){
            int mid = l + (h - l)/2;
            if(arr[mid] > x){
                h = mid - 1;
            }
            else if(arr[mid] < x){
                l = mid + 1;
            }
            else{
                last = mid;
                l = mid + 1;
            }
        }
        list.add(0,first);
        list.add(1,last);
        return (list);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array = ");
        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be searched = ");
        int k = sc.nextInt();
    }
}
