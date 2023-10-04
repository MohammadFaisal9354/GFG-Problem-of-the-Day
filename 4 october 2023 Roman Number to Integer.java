//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
       public int romanToDecimal(String str) {
        HashMap<Character, Integer> eg= new HashMap<>();
        int res=0;
        eg.put('I',1);
        eg.put('V',5);
        eg.put('X',10);
        eg.put('L',50);
        eg.put('C',100);
        eg.put('D',500);
        eg.put('M',1000);
        for(int i=0; i< str.length();i++){
            int  x = eg.get(str.charAt(i));
            int  y = 0;
            if(i < str.length()-1)
                y=eg.get(str.charAt(i+1));
            if(y>x){
                res += y-x;
                i++;
            }else
                res += x;
        }
        return res;
    }
}
