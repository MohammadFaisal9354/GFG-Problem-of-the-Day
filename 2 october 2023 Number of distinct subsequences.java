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
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.distinctSubsequences(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int mod = 1000000007;
    int distinctSubsequences(String S) {
        int ans = 1;
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (mp.containsKey(c)) {
                int temp = ans;
                ans = ((ans * 2) % mod - mp.get(c) + mod) % mod;
                mp.put(c, temp);
            } else {
                mp.put(c, ans);
                ans = (ans * 2) % mod;
            }
        }
        return ans;
    }
}
