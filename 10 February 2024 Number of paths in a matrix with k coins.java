//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            
            int  k = Integer.parseInt(read.readLine());
            int  n = Integer.parseInt(read.readLine());
            int arr[][] = new int[n][n];
            String input_line1[] = read.readLine().trim().split("\\s+");
            int c = 0;
            for(int i=0;i<n;i++){
                for(int j = 0;j<n;j++){
                    arr[i][j] = Integer.parseInt(input_line1[c]);
                    c++;
                }
            }
            Solution obj = new Solution();
            System.out.println(obj.numberOfPath(n, k, arr));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    long cnt;
    long numberOfPath(int n, int k, int [][]arr) {
       cnt=0;
       solve(0,0,k,arr,n);
       return cnt;
    }
    void solve(int i,int j,int k,int arr[][],int n){
        if(k<0|| i>=n ||j>=n)
        return ;
        k=k-arr[i][j];
        if( i==n-1 && j==n-1 ){
            if(k==0)
            cnt++;
            return ;
        }
        solve(i+1,j,k,arr,n);
        solve(i,j+1,k,arr,n);
        return;
    }
}
