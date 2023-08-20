//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        int fidx=FirstLast(arr,n,x,1);
        int lidx=FirstLast(arr,n,x,0);
        if(fidx==-1 || lidx==-1)
             return 0;
         return lidx-fidx+1;
    }
    int FirstLast(int arr[],int n,int x,int flag){
        int check=-1;
        int si=0;
        int ans=0;
        int ei=n-1;
        while(si<=ei){
           int mid=si+(ei-si)/2;
            if(arr[mid]==x){
                check=1;
                ans=mid;
                if(flag==1)
                    ei=mid-1;
                else
                    si=mid+1;
            }
            else if(arr[mid]<x)
                si=mid+1;
            else
                ei=mid-1;
        }
        if(check<0)
            return -1;
        return ans;
    }
}
