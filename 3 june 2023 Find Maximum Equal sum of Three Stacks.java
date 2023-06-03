//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int[] a = IntArray.input(br, 3);
            
            
            int[] S1 = IntArray.input(br, a[0]);
            
            
            int[] S2 = IntArray.input(br, a[1]);
            
            
            int[] S3 = IntArray.input(br, a[2]);
            
            Solution obj = new Solution();
            int res = obj.maxEqualSum(a[0],a[1],a[2], S1, S2, S3);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

class Solution {
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
        int sum1 = 0,sum2 = 0,sum3 = 0;
        for(int i:S1)sum1+=i;
        for(int i:S2)sum2+=i;
        for(int i:S3)sum3+=i;
        int idx1 = 0,idx2 = 0,idx3 = 0;
        int mini = Math.min(sum1,Math.min(sum2,sum3));
        while(idx1< S1.length && idx2 <S2.length && idx3<S3.length){
            while(idx1<S1.length && sum1>mini)
                sum1-=S1[idx1++];
            
            while(idx2<S2.length && sum2>mini)
                sum2-=S2[idx2++];
            
            while(idx3<S3.length && sum3>mini)
                sum3-=S3[idx3++];
            
            if(sum1 == sum2 && sum2 == sum3)
            return sum1;
            
            mini = Math.min(sum1 ,Math.min(sum2,sum3));
        }
        return 0;
    }
}
