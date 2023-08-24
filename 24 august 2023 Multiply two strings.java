//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.math.*;

class Multiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Solution g=new Solution();
            System.out.println(g.multiplyStrings(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public String multiplyStrings(String s1,String s2){
        String result="";
        int[] mapping= new int[]{0,1,2,3,4,5,6,7,8,9};
        int l1=s1.length(),l2=s2.length();
        int[] ans= new int[l1+l2];
        for(int i=l1-1;i>=0;i--){
            if(s1.charAt(i)=='-') continue;    
            int carryPerIteration=0,carryOfResult=0;
            int pos=l1-1-i;
            for(int j=l2-1;j>=0;j--){
                char upper=s2.charAt(j), lower=s1.charAt(i);
                if(upper=='-') continue; 
                int resnew = (mapping[lower-'0']*mapping[upper-'0']) +carryPerIteration;
                int res=resnew%10;
                carryPerIteration=resnew/10;
                int newans=ans[pos]+res+carryOfResult;
                ans[pos]=newans%10;
                carryOfResult=newans/10;
                pos++;
            }
            ans[pos]=ans[pos]+carryPerIteration+carryOfResult;
        }
        boolean flag=false;
        for(int i=ans.length-1;i>=0;i--){
            if(ans[i]!=0 || flag==true){
                result =result + ans[i];
                flag=true;
            } 
        }
        if((s1.charAt(0)=='-' && s2.charAt(0)=='-') || (s1.charAt(0)!='-' && s2.charAt(0)!='-')) return result;
        result = "-"+result;
        return result;
    }
}
