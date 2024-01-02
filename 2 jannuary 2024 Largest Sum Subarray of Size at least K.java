//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            System.out.println(obj.maxSumWithK(a, n, k));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public long maxSumWithK(long a[], long n, long k)
    {
        long[] dp = new long[(int)n+1];
        for(int i = (int)n-1;i>=0;i--){
            dp[i] = a[i] + dp[i+1];
            dp[i] = Math.max(0, dp[i]);
        }
        long curr_sum = 0;
        long max_sum = Integer.MIN_VALUE;
        for(int i=0; i < (int)k ; i++)
            curr_sum = curr_sum + a[i];
        for(int i=(int)k;i<(int)n;i++){
            max_sum = Math.max(max_sum, curr_sum+dp[i]);
            curr_sum = curr_sum + a[i];
            curr_sum = curr_sum - a[i-(int)k];
        }
        return Math.max(max_sum, curr_sum);
    }
}
