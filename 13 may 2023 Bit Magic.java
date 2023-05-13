class Solution {
    public static int bitMagic(int n, int[] arr) {
        int i=0;
        int j=n-1;
        int totalMismatch=0;
        while(i<=j){
            if(arr[i]!=arr[j])
                totalMismatch++;
            i++;
            j--;
        }
        if(totalMismatch==0)
            return 0;
        else 
            return (totalMismatch%2==0) ? (totalMismatch/2) : ((totalMismatch/2)+1);
    }
}
