class Solution {

    public long[] optimalArray(int n,int a[])

    {

        ArrayList<Long> s = new ArrayList<Long>();

        ArrayList<Long> w = new ArrayList<Long>();

        

        s.add((long)a[0]);

 

        for(int i = 1; i < n; i++) {

            s.add(s.get(i-1) + a[i]);

        }

        

        if(n > 0) w.add((long)0);

        

        if(n > 1) w.add((long)a[1] - a[0]);

 

        for(int i = 2; i < n; i++) {

            if(i % 2 == 0)

                w.add(s.get(i) - s.get(i/2) - s.get((i/2)-1));

            else 

                w.add(w.get(i-1) + a[i] - a[i/2]);

        }

        return w.stream().mapToLong(i -> i).toArray();

    }

}
