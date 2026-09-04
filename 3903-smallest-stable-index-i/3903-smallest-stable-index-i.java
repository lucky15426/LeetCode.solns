class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int j=0;
        
        
        while(j<n){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
            for(int i=0;i<=j;i++){
                max=Math.max(max,nums[i]);

            }
            for(int i=j;i<n;i++){
                min=Math.min(min,nums[i]);
            }
            
            if(max-min<=k){
                return j;
            }
            j++;

        }
        
            return -1;
        
    }
}