//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if(low < high) {
            int partiIndex = partition(arr, low, high);
            quickSort(arr, low, partiIndex - 1);
            quickSort(arr, partiIndex + 1, high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1, j;
        for(j = low; j < high; j ++) {
            if(arr[j] <= pivot) {
                i ++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        return i;
    } 
}
