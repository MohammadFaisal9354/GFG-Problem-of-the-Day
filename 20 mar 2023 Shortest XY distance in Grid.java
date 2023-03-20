//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");

            int N = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);

            ArrayList<ArrayList<Character>> grid = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                ArrayList<Character> col = new ArrayList<>();
                String S1[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    col.add(S1[j].charAt(0));
                }
                grid.add(col);
            }

            Solution ob = new Solution();
            System.out.println(ob.shortestXYDist(grid, N, M));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class x
{
    int a,b,c;
}
class Solution {
    static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int n,int m) {
        Queue<x> q=new LinkedList<>();
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid.get(i).get(j)=='X')
                {
                    x f=new x();
                    f.a=i;f.b=j;f.c=0;
                    q.add(f);
                    vis[i][j]=true;
                }
                
            }
        }
        while(!q.isEmpty())
        {
            x f=q.poll();
            if(grid.get(f.a).get(f.b)=='Y')
            return f.c;
            if(f.a+1<n && !vis[f.a+1][f.b])
            {
                x g=new x();
                g.a=f.a+1;g.b=f.b;g.c=f.c+1;
                q.add(g);
                vis[g.a][g.b]=true;
            }
            if(f.b+1<m && !vis[f.a][f.b+1])
            {
                x g=new x();
                g.a=f.a;g.b=f.b+1;g.c=f.c+1;
                q.add(g);
                vis[g.a][g.b]=true;
            }
            if(f.a-1>=0 && !vis[f.a-1][f.b])
            {
                x g=new x();
                g.a=f.a-1;g.b=f.b;g.c=f.c+1;
                q.add(g);
                vis[g.a][g.b]=true;
            }
            if(f.b-1>=0 && !vis[f.a][f.b-1])
            {
                x g=new x();
                g.a=f.a;g.b=f.b-1;g.c=f.c+1;
                q.add(g);
                vis[g.a][g.b]=true;
            }
        }
        return -1;
    }
};
