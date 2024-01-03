//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        int[][] exitAndIndex=new int[3][2];
        for(int[] row:exitAndIndex)
            Arrays.fill(row,-1);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<S.length();i++){
            exitAndIndex[S.charAt(i)-'0'][0]=1;
            exitAndIndex[S.charAt(i)-'0'][1]=i;
            if(exitAndIndex[0][0]==1 && exitAndIndex[1][0]==1 && exitAndIndex[2][0]==1 ){
                int maxIndex=Math.max(exitAndIndex[0][1],Math.max(exitAndIndex[1][1],exitAndIndex[2][1]));
                int minIndex=Math.min(exitAndIndex[0][1],Math.min(exitAndIndex[1][1],exitAndIndex[2][1]));
                min=Math.min(maxIndex-minIndex+1,min);
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
};
