class Solution {
    public boolean canReach(int[] arr, int start) {
        int n=arr.length;
        return dfs(arr,start);

    }
    private boolean dfs(int arr[],int i){
        if(i<0 || i>=arr.length || arr[i]<0){
            return false;
        }

        if(arr[i]==0){
            return true;
        }else{
            arr[i]=-arr[i];
        }

        boolean left=dfs(arr,i-arr[i]);
        boolean right=dfs(arr,i+arr[i]);

        return left||right;

    }
}