class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> result=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();

        if(root==null)return result;

        q.add(root);

        boolean lefttoright=true;

        while(!q.isEmpty()){
            List<Integer>sublist=new ArrayList<>();
            int size=q.size();

            for(int i=0;i<size;i++){
                TreeNode curr=q.remove();

                sublist.add(curr.val);

                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);

            }

            if(!lefttoright){
                Collections.reverse(sublist);
            }
            result.add(sublist);
            lefttoright=!lefttoright;
        }
        return result;


        
    }
}