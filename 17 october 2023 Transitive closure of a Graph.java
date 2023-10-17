//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            int graph[][] = new int[N][N];
            
            for(int i = 0;i < N;i++)
                {String a[] = in.readLine().trim().split("\\s+");
                for(int j=0;j<N;j++)
                graph[i][j] = Integer.parseInt(a[j]);}
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.transitiveClosure(N, graph);
            for(int i = 0;i < N;i++)
               { for(int j = 0;j < ans.get(i).size();j++)
                    System.out.print(ans.get(i).get(j) + " ");
            System.out.println();}
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
   static ArrayList<ArrayList<Integer>> transitiveClosure(int n, int graph[][])
   {
       ArrayList<ArrayList<Integer>> fin1=new ArrayList<ArrayList<Integer>>();
       int[][] fin=new int[n][n];
       for(int i=0;i<n;i++){
           dfs(graph,fin,i);
       }
      
       for(int i=0;i<n;i++){
           fin1.add(new ArrayList<>());
           for(int j=0;j<fin[i].length;j++)
               fin1.get(i).add(fin[i][j]);
       }
       return fin1;
   }
   static void dfs(int[][] graph,int[][] fin,int curr_ver){
       Vector<Boolean> visited=new Vector<>(graph.length);
       for(int i=0;i<graph.length;i++){
           visited.add(false);
       }
       Stack<Integer> stack=new Stack<>();
       stack.push(curr_ver);
       while(stack.size()>0){
           int v=stack.pop();
           if(visited.get(v)==false){
               fin[curr_ver][v]=1;
               visited.set(v,true);
                   for(int i=0;i<graph.length;i++){
                   if(graph[v][i]==1)
                       stack.push(i);
               }
           }
           
       }
   }
}
