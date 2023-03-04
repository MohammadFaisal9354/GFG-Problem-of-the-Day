

class Solution {
    public static long bestNode(int N, int[] A, int[] P) {
        // code here
        Set<Integer> set=new HashSet<>();
        for(int k:P){
            set.add(k);
        }
        List<Integer> leafnode=new ArrayList<>();
        for(int i=1;i<=P.length;i++){
            if(!set.contains(i)){
                leafnode.add(i);
            }
        }
        int answer=Integer.MIN_VALUE;
        for(int leaf:leafnode){
            int node=leaf;
            int fb=0;
            while(node!=-1){
                fb*=-1;
                fb+=A[node-1];
                if(answer<fb) answer=fb;
                node=P[node-1];
            }
         }
             return answer;
    
    }
}
        
