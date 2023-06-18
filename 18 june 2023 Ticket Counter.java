//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String s[]=in.readLine().trim().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            Solution ob=new Solution();
            out.println(ob.distributeTicket(n,k));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    public static int distributeTicket(int N,int K)
    {  
        int Z=N,a=0,count=0;
       for(int i=0;i<=N/K;i++){
           if(count==0){
               if(a+K>=Z) return(Z);
               a=a+K;
               count=1;
           }
           else{
               if(Z-K<=a) return(a+1);
               count=0;
               Z=Z-K;
           }
       }
       if(count==0) return(Z);
       else return a;
    }
}
