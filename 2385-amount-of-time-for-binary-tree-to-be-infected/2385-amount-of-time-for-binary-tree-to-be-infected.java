class Solution {
    public TreeNode getNode(TreeNode root,int start){
        if(root==null)return null;
        if(root.val==start)return root;

        TreeNode l=getNode(root.left,start);
        TreeNode r=getNode(root.right,start);
        if(l==null)return r;
        else return l;
    }
    private void preorder(TreeNode root,HashMap<TreeNode,TreeNode>p){
        if(root==null)return;

        if(root.left!=null)p.put(root.left,root);
        if(root.right!=null)p.put(root.right,root);
        preorder(root.left,p);
        preorder(root.right,p);
    }
    public int amountOfTime(TreeNode root, int start) {
        TreeNode node=getNode(root,start);

        HashMap<TreeNode,TreeNode>p=new HashMap<>();
        preorder(root,p);

        //bfs

        Queue<TreeNode>q=new LinkedList<>();
        q.add(node);
        Map<TreeNode,Integer>vis=new HashMap<>();
        vis.put(node,0);

        while(q.size()>0){
            TreeNode temp=q.peek();
            int level=vis.get(temp);
            if(temp.left!=null && !vis.containsKey(temp.left)){
                q.add(temp.left);
                vis.put(temp.left,level+1);
            }
            if(temp.right!=null && !vis.containsKey(temp.right)){
                q.add(temp.right);
                vis.put(temp.right,level+1);
            }
            if(p.containsKey(temp)&& !vis.containsKey(p.get(temp))){
                q.add(p.get(temp));
                vis.put(p.get(temp),level+1);
            }
            q.remove();
           


        }
        int max=Integer.MIN_VALUE;

        for(int value:vis.values()){
            max=Math.max(value,max);
            

        }
        return max;



        
    }
}