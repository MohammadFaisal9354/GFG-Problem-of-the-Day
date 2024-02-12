//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.sequence(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long sequence(int n){
        long sum=0;
        long c =1000000007;
        int a=1;
        long sum1=0;
        for(int i=1; i<=n; i++){
            sum=1;
            for(int j=0; j<i; j++){
                sum =(sum*a)%c;
                a++;
            }
            sum1 = (sum1%c)+(sum%c);
        }
        sum1 = sum1%c;
        return sum1;
    }
}
