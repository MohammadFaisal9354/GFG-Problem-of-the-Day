//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    boolean func(int i,String p,String t){
        int j=0;
        for(j=0;j<p.length() && i<t.length();j++){
            if(p.charAt(j)!=t.charAt(i++))
            return false;
        }
        if(j==p.length())
        return true;
        else
        return false;
    }
    ArrayList<Integer> search(String p, String t)
    {
       ArrayList<Integer> A=new ArrayList<>();
       for(int i=0;i<t.length();i++){
           if(t.charAt(i)==p.charAt(0)){
               if(func(i,p,t))
                   A.add(i+1);
           }
       }
       return A;
    }
}
