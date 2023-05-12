 public static int arrayOperations(int n, int[] arr) {
        int res = 0;        
        Set<Integer> set = new HashSet<>();        
       for(int i = 0 ; i < n; i++){
           if(arr[i] > 0)
           set.add(arr[i]);
           
           if(arr[i] == 0 && set.size() > 0){
               res++;
               set.clear();
           }
       }       
       if(set.size() > 0)
       res++;      
       return res;
    }
