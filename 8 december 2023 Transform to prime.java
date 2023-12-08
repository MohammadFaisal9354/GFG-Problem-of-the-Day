//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(a1[i]);
            }
            Solution ob = new Solution();
            int ans=ob.minNumber(a,n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public int minNumber(int arr[], int N)
    {
        boolean flag = false;
        int sum = 0;
        for(int i =0; i < N; i ++)
            sum = sum + arr[i];
        int sum1 = sum;
        if(sum1 == 1)
            return 1;
        while(sum1 > 0){
            flag = false;;
            for(int i = 2; i <= sum1 / 2; i++){
                if(sum1%i == 0){
                    flag = true;
                     break;
                }
            }
            if(flag){
                sum1 = sum1+1;
                continue;
            }
            break;
        }
        return sum1-sum;
    }
}
