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
            int n = Integer.parseInt(br.readLine().trim());
            
            String input_line[] = br.readLine().trim().split("\\s+");
            int[][] matrix = new int[n][n];
            for(int i=0; i<n; i++) {
                for (int j = 0; j < n; ++j) {
                    matrix[i][j] = Integer.parseInt(input_line[i * n + j]); 
                }
            }
            Solution obj = new Solution();
            int[] ans = obj.antiDiagonalPattern(matrix);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
        int ct=0,i=0,j=0,ct1=0;
        int n=matrix.length;
        int[] arr=new int[n*n];
        while(ct<n*n){
            if(i<n && i>=0 && j<n && j>=0){
                arr[ct++]=matrix[i][j];
                i++;
                j--;
                ct1++;
            }else if(j<0 && i<n){
                i-=ct1;
                j+=(ct1+1);
                ct1=0;
            }else{
                i-=(ct1-1);
                j+=(ct1);
                ct1=0;
            }
        }
        return arr;
    }
}
