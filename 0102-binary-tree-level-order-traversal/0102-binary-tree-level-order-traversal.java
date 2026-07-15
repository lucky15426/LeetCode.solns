class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>>result=new ArrayList<>();
        if(root==null){
            return result;
        }
        
        q.add(root);

        
        while(!q.isEmpty()){

            List<Integer>level=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                if(q.peek().left!=null)q.add(q.peek().left);
                if(q.peek().right!=null)q.add(q.peek().right);
                level.add(q.remove().val);

            }
            result.add(level);

        }
        return result;

        

    }
}