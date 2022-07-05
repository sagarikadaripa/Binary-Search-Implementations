import java.util.*;

public class BinarySearch{
    static int searchInSorted(int arr[], int N, int K)
    {
        int left = 0;
        int right = N - 1;
        while(left <= right){
            int mid = (left + right) /2;
            if(arr[mid] < K){
                 left = mid + 1;
            } else if(arr[mid] > K){
                right = mid - 1;
            }
            else{
                return 1; //found the element at the midde
            }
        }
        return -1; //if element does not exits
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array = ");
        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be found = ");
        int k = sc.nextInt();
        System.out.println(searchInSorted(arr,n,k));
    }
}

        