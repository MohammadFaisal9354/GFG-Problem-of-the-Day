//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.findCatalan(n);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    int mod = (int)(1e9+7);
    public int findCatalan(int n) {
        long[] arr = new long[n+1];
        arr[0] = 1L;
        arr[1] = 1L;
        for(int i=2; i<=n; i++)
            for(int j=0; j<i; j++)
                arr[i] = (arr[i] + arr[j] * arr[i-j-1])%mod;
        return (int)arr[n];
    }
}
