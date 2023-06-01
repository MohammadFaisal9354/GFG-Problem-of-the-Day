class Solution
{
    //Function to return list containing vertices in Topological order. 
     static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int ind =0;
        int [] indegree  =new int[V];
        for(int i=0; i<V;i++){
            for(var nn:adj.get(i))
                indegree[nn]++;
        }
        int[] ans = new int[V];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<V; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int nn =q.poll();
            ans[ind++] = nn;
            for(var i:adj.get(nn)){
                indegree[i] -=1;
                if(indegree[i] == 0)
                    q.add(i);
            }
        }
        return ans;
    }
}
