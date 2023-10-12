package BST;

public class CheckForBST {
         boolean isBST(Node root)
    {
        // code here.
        return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    boolean check(Node root,int min,int max){
        if(root==null) return true;
        if(root.data<min || root.data>max) return false;
        return (check(root.left,min,root.data-1)&&check(root.right,root.data+1,max));
    }
    
}
