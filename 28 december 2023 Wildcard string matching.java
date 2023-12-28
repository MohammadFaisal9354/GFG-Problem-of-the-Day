//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0)
        {
            String wild = in.readLine();
            String pattern = in.readLine();
            
            Solution ob = new Solution();
            boolean flag = ob.match(wild, pattern);
            if(flag)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean match(String wild, String pattern){
        int n=wild.length();
        int m=pattern.length();
        return go(n,m,wild,pattern); 
    }
        static boolean go(int n, int m, String w, String p){
        if(m==0&& n==0) return true;
        else if(m==0 || n==0) return false;
        if(w.charAt(n-1)==p.charAt(m-1)||w.charAt(n-1)=='?') return go(n-1,m-1,w,p);
        else if(w.charAt(n-1)=='*')
        return go(n-1,m-1,w,p) || go(n,m-1,w,p);
        else return false;
    }
}
