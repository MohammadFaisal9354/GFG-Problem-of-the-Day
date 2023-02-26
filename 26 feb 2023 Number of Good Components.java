class Solution {

    public int findNumberOfGoodComponent(int V, ArrayList<ArrayList<Integer>> adj) {

        

       boolean vis[] = new boolean[V+1];

       int res=0;

       for(int i = 1; i<=V; i++){

           if(!vis[i] &&bfs(adj,i,vis))

               res++; 

         

       }

       return res;

    }

    

    boolean bfs(ArrayList<ArrayList<Integer>> adj, int node, boolean[] vis){

        Queue<Integer>q = new LinkedList<>();

       

       q.add(node);

        vis[node]= true;

        int size = adj.get(node).size(),cnt =1;

        boolean flag  = true;

        

        while(!q.isEmpty()){

            int x = q.poll();

            if(adj.get(x).size() != size)flag = false;

            for(int i = 0; i<adj.get(x).size(); i++){

                if(!vis[adj.get(x).get(i)]){

                    cnt++;

                    vis[adj.get(x).get(i)] = true;

                    q.add(adj.get(x).get(i));

                }

            }

        }

        

        return flag && cnt == size+1;

    }

    

}
