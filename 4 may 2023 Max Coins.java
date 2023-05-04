//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

class GFG implements Runnable
{
    public static void main(String args[])throws IOException
    {
        new Thread(null, new GFG(), "whatever", 1<<26).start();
    }
    public void run()
    {
        try{
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
            int t=Integer.parseInt(in.readLine());
            while(t-->0){
                int n=Integer.parseInt(in.readLine().trim());
                int a[][]=new int[n][3];
                for(int i=0;i<n;i++){
                    String s[]=in.readLine().trim().split(" ");
                    a[i][0]=Integer.parseInt(s[0]);
                    a[i][1]=Integer.parseInt(s[1]);
                    a[i][2]=Integer.parseInt(s[2]);
                }
                Solution ob=new Solution();
                out.println(ob.maxCoins(n,a));
            }
            out.close();
        }catch(Exception e){
            ;
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
       private static int maxCoinsHelper(int[][] ranges, int index, int selectedCoins, Integer[][] memo) {
        if (index >= ranges.length || selectedCoins >= 2) 
            return 0;
        if (memo[index][selectedCoins] != null) 
            return memo[index][selectedCoins];
        int notTaken = maxCoinsHelper(ranges, index + 1, selectedCoins, memo);
        int newIdx = (int)(1e9) + 1, left = index + 1, right = ranges.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (ranges[mid][0] >= ranges[index][1]) {
                newIdx = mid;
                right = mid - 1;
            } else 
                left = mid + 1;
        }
        int taken = ranges[index][2] + maxCoinsHelper(ranges, newIdx, selectedCoins + 1, memo);
        return memo[index][selectedCoins] = Math.max(taken, notTaken);
    }
        public static int maxCoins(int n,int ranges[][]) {
        Arrays.sort(ranges, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        Integer[][] memo = new Integer[n + 1][3];
        return maxCoinsHelper(ranges, 0, 0, memo);
    }
}
