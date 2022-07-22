import java.util.Scanner;

public class binarySearchRecursion {
    static int BinarySearch(int arr[],int N,int l,int h,int x){
        //base condition
        if(l > h)   
            return -1;
        
        int mid = l + (h - l)/2;
        if(arr[mid] > x){
            return BinarySearch(arr,N,l,mid - 1,x);
        }
        else if(arr[mid] < x){
            return BinarySearch(arr,N,mid + 1,h,x);
        }
        else{
            return 1;
        }
    }
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        return BinarySearch(arr,N,0,N - 1,K);
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array = ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key to search = ");
        int k = sc.nextInt();
        int ans = searchInSorted(arr,n,k);
        System.out.println("ANS = "+ans);
    }
}
