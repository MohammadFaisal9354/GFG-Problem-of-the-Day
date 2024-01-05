//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.TotalWays(N);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int TotalWays(int N)
    {
        long mod = 1000000007;
        if(N==1)
            return 4;
        long first = 1;
        long second = 1;
        long prev_f = 0,prev_s = 0;
        for(int i=2;i<=N;i++){
            prev_f = second;
            second = (first + second)%mod ;
            first = prev_f;
            prev_s = second;
        }
        long ans =  ((prev_f + prev_s));
        return (int)((ans*ans)%mod);
    }
}
