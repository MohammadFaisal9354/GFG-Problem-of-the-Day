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
            String[] inp=read.readLine().split(" ");
            int S=Integer.parseInt(inp[0]);
            int D=Integer.parseInt(inp[1]);

            Solution ob = new Solution();
            System.out.println(ob.secondSmallest(S,D));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String secondSmallest(int S, int D){
        if(9*D<=S)return "-1";
        char ans[]=new char[D];
        Arrays.fill(ans,'0');
        ans[0]='1';
        S--;
      
        for(int i=ans.length-1;i>=0;i--){
           if(S>=9){
               ans[i]='9';
               S-=9;
           }
           else{
               ans[i]+=S;
               if(i==ans.length-1){
                   ans[i]=--ans[i];
                   ans[i-1]=++ans[i-1];
               }
               else{
                   ans[i+1]=--ans[i+1];
                   ans[i]=++ans[i];
               }
               break;
           }
        }
        return new String(ans);
    }
}
