//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String[] Dictionary=read.readLine().split(" ");
            String Pattern=read.readLine();
            Solution ob = new Solution();
            ArrayList <String> ans=ob.CamelCase(N,Dictionary,Pattern);
            for(String u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        ArrayList<String> res = new ArrayList<>();
        for(int i=0;i<N;i++){
            int temp=0;
            String s= Dictionary[i];
            for(int j=0;j<s.length();j++){
                char c= s.charAt(j);
            if((int)c <=90){
                if(temp<Pattern.length() && c==Pattern.charAt(temp)) 
                temp++;
                else 
                break;
                }
            }
            if(temp==Pattern.length()) 
            res.add(s);
        }
        if(res.size()<1) {
            res.add("-1");
            return res;
        }
        else{
            Collections.sort(res);
            return res;
        }
    }
}
