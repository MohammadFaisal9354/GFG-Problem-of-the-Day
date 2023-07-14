//{ Driver Code Starts
import java.util.*;

class TwoStack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		int T = sc.nextInt();
		while(T>0)
		{
			twoStacks g = new twoStacks();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int stack_no = sc.nextInt();
				int QueryType = sc.nextInt();
				
				
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					if(stack_no == 1)
					 g.push1(a);
					else if(stack_no ==2)
					 g.push2(a);
				}else if(QueryType == 2)
				{
					if(stack_no==1)
					System.out.print(g.pop1()+" ");
					else if(stack_no==2)
					System.out.print(g.pop2()+" ");
				}
			
				Q--;
			}
				System.out.println();
		  T--;
		}
	}
}


// } Driver Code Ends



class twoStacks{
    
    int[] arr = new int[100];
    int p1=-1;
    int p2=arr.length;
    
    void push1(int x){
        
         if(p1+1!=p2){
             p1++;    
             arr[p1]=x;
         }
      
    }
    void push2(int x){
        
         if(p2-1!=p1){
             p2--; 
             arr[p2]=x;
         }
    }
    
    int pop1(){
        
        if(p1==-1) return -1;
        int val=arr[p1];
        p1--;
        return val;
    }
    
    int pop2()
    {
        if(p2==arr.length) return -1;
        int val=arr[p2];
        p2++;
        return val;
    }
}
