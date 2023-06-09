//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    public static void Generate_permutation(StringBuilder s1, String res, ArrayList<String> words){
        if(res.length() == s1.length()) {
            if(!words.contains(res)) words.add(res);
            return ;
        }
        for(int i=0;  i<s1.length(); i++){
            if(s1.charAt(i) != '#'){
                char c = s1.charAt(i);
                s1.setCharAt(i, '#');
                Generate_permutation(s1, res+c, words);
                s1.setCharAt(i, c);
            }
        }
    }  
    public List<String> find_permutation(String S) {
        char [] arr = S.toCharArray();
        Arrays.sort(arr);
        String s = new String(arr);
        StringBuilder sb = new StringBuilder(s);
        ArrayList<String> list =new ArrayList<>();
        Generate_permutation(sb, "", list);
        return list;
    }
}
