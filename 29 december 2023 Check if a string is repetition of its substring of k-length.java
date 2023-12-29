//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String s = sc.next();
            int k = sc.nextInt();
            int answer = new Solution().kSubstrConcat(n,s,k);
    		System.out.println(answer);
        }
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Solution
{
     int kSubstrConcat(int n, String s, int k) {
        if(n%k != 0) return 0;
        HashSet<String> hs= new HashSet<>();
        for(int i=0;i<n;i+=k){
            hs.add(s.substring(i,i+k));
            if(hs.size()>2) return 0;
        }
        if(hs.size()==2|| hs.size()==1) return 1;
        return 0;
    }
}
