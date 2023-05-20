static boolean isStraightHand(int N, int groupSize, int hand[]) {
        // code here
        
        if(N%groupSize !=0) return false;
        
        HashMap<Integer,Integer> hm= new HashMap<>();
        Arrays.sort(hand);
        
        for(int i=0;i<hand.length;i++){
            hm.put(hand[i],hm.getOrDefault(hand[i],0)+1);
        }
        
        for(int i=0;i<hand.length;i++){
            if(hm.containsKey(hand[i])){
                if(hm.get(hand[i])>1) hm.put(hand[i],hm.get(hand[i])-1);
                else hm.remove(hand[i]);
                
                int count=1;
                int nextVal=hand[i]+1;
                while(count<groupSize){
                    if(hm.containsKey(nextVal)){
                        count++;
                        
                        if(hm.get(nextVal)>1) hm.put(nextVal,hm.get(nextVal)-1);
                        else hm.remove(nextVal);
                        
                        nextVal++;
                        
                    }
                    else return false;
                }
            }
        }
        
        return  true;
    }
