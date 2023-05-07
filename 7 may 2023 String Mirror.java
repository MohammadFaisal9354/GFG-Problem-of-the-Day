//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String str;
            str = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.stringMirror(str);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String stringMirror(String str) {
        String smallest="";
        int i=1;
        char prev=str.charAt(0);
        smallest+=prev;
        smallest+=prev;
        if(str.length()>1 && str.charAt(1)==prev){
            return smallest;
        }
        for(;i<str.length();i++){
            if((int)str.charAt(i)>(int)prev){
                break;
            }
            prev=str.charAt(i);
        }
        smallest=str.substring(0,i);
        i--;
        smallest+=reverse(str,i);
        return smallest;
        
    }
    public static String reverse(String str, int i){
        String rt="";
        for(;i>=0;i--){
            rt+=str.charAt(i);
        }
        return rt;
    }
}
