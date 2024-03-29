//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().checkTriplet(arr, n);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
     boolean checkTriplet(int[] arr, int n) {
        HashSet<Integer>list = new HashSet<>();
        for(int i=0; i<n; i++){
            arr[i] = arr[i]*arr[i];
            list.add(arr[i]);
        }
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int sum = arr[i]+arr[j];
                if(list.contains(sum))
                return true;
            }
        }
        return false;
    }
}
