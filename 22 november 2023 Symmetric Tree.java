class GfG
{
    static boolean helper(Node h1, Node h2){
        if(h1==null && h2==null)return true;
        else if(h1==null || h2==null)
            return false;
        else {
            if(h1.data!=h2.data)return false;
            else return helper(h1.left,h2.right) && helper(h1.right,h2.left);
        }
    }
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        return helper(root,root);
    }
}
