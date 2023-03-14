//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int N = Integer.parseInt(br.readLine());
			ArrayList<Integer> arr = new ArrayList<>(N);
			String [] str = br.readLine().trim().split(" ");
			for(int i = 0; i < N; i++) {
				arr.add(Integer.parseInt(str[i]));
			}
			Solution obj = new Solution();
			System.out.println(obj.maxCoins(N, arr));
		}
	}
}
// } Driver Code Ends




//User function Template for Java

class Solution{
    int maxCoins(int N, ArrayList<Integer> arr) {
		arr.add(0,1);
		arr.add(1);
		int dp[][] = new int[arr.size()+2][arr.size()+2];
        for(int a[]: dp)
        Arrays.fill(a,-1);
		return max(1,N,arr,dp);
	}
	int max(int lo , int hi , ArrayList<Integer> arr,int dp[][]){
	    if(lo>hi)return 0;
	    if(dp[lo][hi]!=-1)return dp[lo][hi];
	    int ans = 0;
	    for(int i = lo ; i <= hi ; i++){
	        int val1 = arr.get(lo-1)*arr.get(i)*arr.get(hi+1) ;
	        int val2 = max(lo,i-1,arr,dp);
	        int val3 = max(i+1,hi,arr,dp);
	        ans = Math.max(ans , val1+ val2+val3);
	   		}
	    return dp[lo][hi]=ans;
	}
}
