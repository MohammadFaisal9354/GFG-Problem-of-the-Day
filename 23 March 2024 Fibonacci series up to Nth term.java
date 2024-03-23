//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int ans[] = obj.Series(n);
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {

    int[] Series(int n) {
        int[] fibo=new int[n+1];
        fibo[0]=0;
        fibo[1]=1;
        for(int i=2;i<=n;i++){
             fibo[i]=fibo[i-1]+fibo[i-2];
             fibo[i]=fibo[i]%(int)(Math.pow(10,9)+7);
           
        }
        return fibo;
    }
}
