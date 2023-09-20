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
            int n = sc.nextInt();
            int d = sc.nextInt();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.rotate (n, d);
            System.out.println(res.get(0));
            System.out.println(res.get(1));
            
           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList<Integer> rotate(int N, int D){
        ArrayList<Integer> list = new ArrayList<>();
        D=D%16;
        int leftRotate=N;
        int rotate=D;
        while(rotate-->0){
            int leftMostBit=((leftRotate & (1<<15))!=0)?1:0;
            leftRotate=leftRotate<<1;
            leftRotate=leftRotate|leftMostBit;
            if((leftRotate&(1<<16))!=0)leftRotate=leftRotate^((1<<16));
        }
        list.add(leftRotate);
        int rightRotate=N;
        rotate=D;
        while(rotate-->0){
            int rightMostBit=((rightRotate & 1)!=0)?1:0;
            rightRotate=rightRotate>>1;
            if(rightMostBit==1)rightRotate=rightRotate|(1<<15);
        }
        list.add(rightRotate);
        return list;
    }
}
