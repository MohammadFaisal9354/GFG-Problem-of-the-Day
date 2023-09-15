int sum = 0;
        for(int i=0; i<N; i++){
            sum+=arr[i];
        }
        if(sum%2==1) return 0;
        sum = sum/2;
        int dp[][] = new int[N+1][sum+1];
        for(int i=0; i<=N; i++){
            dp[i][0] = 1;
        }
        for(int i=1; i<=N; i++){
            for(int j=0; j<=sum; j++){
                if(arr[i-1]<=j) dp[i][j] = dp[i-1][j]+dp[i-1][j-arr[i-1]];
                else dp[i][j] = dp[i-1][j];
            }
        }
        if(dp[N][sum]!=0) return 1;
        return 0;
