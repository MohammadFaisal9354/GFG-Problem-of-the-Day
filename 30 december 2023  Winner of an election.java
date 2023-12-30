//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++) 
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        String str[] = new String[2];
        str[1] = "";
        int max = 0;
        for(String s:map.keySet()) {
            if(map.get(s)>max) {
                str[0] = s;
                str[1] = "";
                str[1]+= (char)(48+map.get(s));
                max = map.get(s);
            }
            else if(map.get(s)==max) {
                if(str[0].compareTo(s)>0) 
                    str[0] = s;
            }
        }
        return str;
    }
}
