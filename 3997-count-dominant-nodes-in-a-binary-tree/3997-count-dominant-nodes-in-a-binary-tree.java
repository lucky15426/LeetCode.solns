
class Solution {
    int count=0;
    public int countDominantNodes(TreeNode root) {
        dfs(root);
        return count;
        
    }
    private int dfs(TreeNode root){
        if(root==null)return Integer.MIN_VALUE;
        int max=0;

        int left=dfs(root.left);
        int right=dfs(root.right);

        max=Math.max(root.val,Math.max(left,right));
        if(root.val==max)count++;

        return max;
    }
}