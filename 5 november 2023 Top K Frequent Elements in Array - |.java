//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Check{
    int value;
    int frequency;
    public Check(int value,int frequency){
        this.value = value;
        this.frequency = frequency;
    }
}

class Solution {
    public int[] topK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i])+1);        
            else
                map.put(nums[i],1);
        }
        PriorityQueue<Check> pq = new PriorityQueue<>(new Comparator<Check>(){
            @Override
            public int compare(Check a,Check b){
                if(a.frequency == b.frequency)
                    return b.value - a.value;
                else
                    return b.frequency - a.frequency;
            }
        });
        map.forEach((e1,e2)->{
            pq.add(new Check(e1,e2));
        });
        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = pq.poll().value;
        }
        return ans;
    }
}
