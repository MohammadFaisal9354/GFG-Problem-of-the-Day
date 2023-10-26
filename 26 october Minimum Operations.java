//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperation(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java


class Solution
{
    public int minOperation(int n)
    {
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        if(n<=1)
            return dp[n];
        dp[2]=2;
        for(int i=3;i<n+1;i++){
            if(i%2==0)
                dp[i]= dp[i/2]+1;
            else
                dp[i]= dp[i-1]+1;
        }
       return dp[n]; 
    }
}
