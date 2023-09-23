class Solution {
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        if(n == 1) return 1;
        int i=1;
        int ans=-1;
        long sum=0;
        for(long t : arr)
        sum+=t;
        long sum1 = 0;
        while(i <= n){
            sum -= arr[i-1];
            if(sum1 == sum){
                ans= i;
                break;
            }
            sum1 += arr[i-1];
            i++;
        }
        return ans;
    }
}
