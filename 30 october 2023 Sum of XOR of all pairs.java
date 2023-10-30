//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    
		    Solution obj = new Solution();
		    long res = obj.sumXOR(arr, sizeOfArray);
		    System.out.println(res);
		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution{
   
    // Function for finding maximum and value pair
    public long sumXOR (int arr[], int n) {
        long[] v = new long[31];
        long ans = 0; 
        for (int i = 0; i < n; i++) {
        long x = arr[i]; 
        for (int j = 0; j < 31; j++) {
            if ((x & 1) == 1) {
                long a = i - v[j];
                long res = a * (1 << j);
                ans += res;
                v[j]++;
            } else {
                long a = v[j];
                long res = a * (1 << j);
                ans += res;
            }
            x >>= 1;
            }
        }
        return ans;
    }
}
