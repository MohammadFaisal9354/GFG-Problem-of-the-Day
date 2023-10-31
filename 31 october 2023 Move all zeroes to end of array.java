//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
     void swap(int n1,int n2,int arr[]){
            int temp=arr[n1];
            arr[n1]=arr[n2];
            arr[n2]=temp;
        }
    void pushZerosToEnd(int[] arr, int n) { 
        int nonZero=0;
        int Zero=0;
        if(arr.length==0||arr.length==1)
            return;
        while(nonZero<arr.length){
            if(arr[nonZero]!=0){
                swap(nonZero,Zero,arr);
                nonZero++;
                Zero++;
            }
            else
                nonZero++;
        }
       
        
    }
}
