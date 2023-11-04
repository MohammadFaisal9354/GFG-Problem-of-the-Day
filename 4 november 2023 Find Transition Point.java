//{ Driver Code Starts
import java.util.*;

class Sorted_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    int transitionPoint(int arr[], int n) {
     int l = 0;
     int h = arr.length-1;
     int tp = -1;
     while(l<=h){
         int mid = (l+h)/2;
         if(arr[mid] ==1){
             tp = mid;
             h = mid-1;
         }else{
             l = mid+1;
         }
     }
     return tp;
    }
}
