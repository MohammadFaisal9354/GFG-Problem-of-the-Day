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
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            int ans = ob.Count(matrix);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    int countzero(int i , int j , int[][] matrix , int n , int m){
        int ct = 0;
        if(i-1>=0)
            if(matrix[i-1][j]==0) ct++;
        
        if(i-1>=0 && j+1<m)
            if(matrix[i-1][j+1]==0) ct++;
        
        if(j+1<m)
            if(matrix[i][j+1]==0) ct++;
        
        if(i+1<n && j+1<m)
            if(matrix[i+1][j+1]==0) ct++;
        
         if(i+1<n)
            if(matrix[i+1][j]==0) ct++;
        
        if(i+1<n && j-1>=0)
            if(matrix[i+1][j-1]==0) ct++;
        
        if(j-1>=0)
            if(matrix[i][j-1]==0) ct++;
        
        if(i-1>=0 && j-1>=0)
            if(matrix[i-1][j-1]==0) ct++;
        
        return ct;
    }
    
    public int  Count(int[][] matrix)
    {
        int ans = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n ; i++){
            for(int j=0; j<m ; j++){
                if(matrix[i][j]==1){
                  int ct0 = countzero(i , j , matrix , n , m);
                if(ct0 % 2==0 && ct0 >0) 
                    ans++;
                }
            }
        }
        return ans;
    }
}
