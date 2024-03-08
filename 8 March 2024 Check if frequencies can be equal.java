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
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            
            Solution ob = new Solution();
            if(ob.sameFreq(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    boolean sameFreq(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if(freq[i]!=0) temp.add(freq[i]);
        }
        int count=0;
        for(int i=1;i<temp.size();i++){
            if(temp.get(i)!=temp.get(i-1)){
                count++;
                if(Math.abs(temp.get(i)-temp.get(i-1))>1) return false;
                if(i>=2 && temp.get(i).equals(temp.get(i-2))) count--;
            }
            if(count>1 || (temp.size() == 4 && temp.get(0) == temp.get(1) && temp.get(2) == temp.get(3))) return false;
        }
        return true;
    }
}
