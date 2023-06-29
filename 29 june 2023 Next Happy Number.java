static int nextHappy(int n){
        // code here
        if(n==0)
        return 1;
        n++;
        while(!find(n))
        {
            n++;
        }
        
        return n;

    }
  static   Boolean find(int n)
    {
        int sum=0;
        while(n>0)
        {
            int temp=n%10;
            sum=sum+temp*temp;
            n=n/10;
            
        }
        if(sum==1||sum==7)
        return true;
        if(sum<=9)
        return false;
        return find(sum);
    }
