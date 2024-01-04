class Solution {
    static int singleElement(int[] arr , int N) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<N;i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
            }
            else{
                h.put(arr[i],1);
            }
        }
         for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }
}
