class LargestVal{
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<s;i++){
                TreeNode n=q.poll();
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
                max=Math.max(max,n.val);
            }
            ans.add(max);
        }
        return ans;
    }
}