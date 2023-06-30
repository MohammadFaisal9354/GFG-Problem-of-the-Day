//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine().trim());
            while(t-->0)
                {
                    String s = in.readLine().trim();
                    Solution ob = new Solution();
                    out.println(ob.isDivisible(s));
                }
                out.close();
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isDivisible(String s) {
        java.math.BigInteger b1 = new java.math.BigInteger(s,2);
        java.math.BigInteger b2 = new java.math.BigInteger("3");
        java.math.BigInteger b3 = new java.math.BigInteger("0");
        java.math.BigInteger rem = b1.remainder(b2);
        if(rem.equals(b3))
            return 1;
        return 0;
        
    }
}
