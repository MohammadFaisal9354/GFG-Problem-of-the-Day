//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int a[][], int n, int m, int k)
    {
        int dir =0;
        int count=0;
        int top = 0;
        int left = 0;
        int right = m-1;
        int bottom = n-1;
       
        ArrayList<Integer> AA = new ArrayList<Integer>();
        while(top<=bottom && left<=right)
        {
            if(dir==0)
            {
                for(int i=left ;i<=right;i++)
                {
                    AA.add(a[top][i]);
                }
                top++;
                dir=1;
                
            }
            if(dir==1)
            {
                for(int i=top;i<=bottom;i++)
                   AA.add(a[i][right]);
                right--;
                dir=2;
            }
            if(dir==2)
            {
                for(int i=right;i>=left;i--)
                    AA.add(a[bottom][i]);
                bottom--;
                dir=3;
            }
            if(dir==3)
            {
                for(int i=bottom;i>=top;i--)
                   AA.add(a[i][left]);
                left++;
                dir=0;
            }
        }
        return AA.get(k - 1);	
    }
}
