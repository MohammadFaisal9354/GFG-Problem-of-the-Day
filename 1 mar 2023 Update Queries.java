class Solution{

 int [] updateQuery(int n, int q, int [][]u){

     int i, j, r, x;

     int a[]=new int[n];

        for(i=0;i<q;i++) {

            r=u[i][1];

            x=u[i][2];

            if(u[i][0]>n)

            continue;

            for(j=u[i][0]-1;j<n&&j<r;j++) {

                a[j]=a[j]|x;

            }

        }

        return a;

    }

}
