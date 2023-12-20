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
            int n = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int A[]= new int[n];
            for(int i = 0; i < n; i++)
                A[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.findWinner(n, A));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int findWinner(int n, int a[]){
        int winner=1;
        if (n%2==1) winner=2;
        for(int i=1; i<n; i++) a[0]^=a[i];
        if (a[0]==0) winner=1;
        return winner;
    }
}
