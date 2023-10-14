class Solution
{
    public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(root1==null || root2==null) return list;
        traverse(root1, root2, list);
        Collections.sort(list);
        return list; 
    }
    static void traverse(Node root1, Node root2, ArrayList<Integer> list){
        if(root1 == null) return;
        
        if(find(root2, root1.data)) list.add(root1.data);
        
        traverse(root1.left, root2, list);
        traverse(root1.right, root2, list);
    }
    
    
    public static boolean find(Node root, int target){
        if(root == null) return false;
        
        if(root.data == target) return true;
        
        else if(root.data > target) return find(root.left, target);
        
        else return find(root.right, target);
        
    }
}
