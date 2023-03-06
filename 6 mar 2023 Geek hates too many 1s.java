//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.noConseBits(n);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int noConseBits(int n) {
       String str=Integer.toBinaryString(n);

       char [] arr= str.toCharArray();

       for(int i=0;i<arr.length-2;i++){

           if(arr[i]=='1' && arr[i+1]=='1' && arr[i+2]=='1'){

               arr[i+2]='0';

           }

       }

       String s= String.valueOf(arr);

       return Integer.parseInt(s,2);
    }
}
        
