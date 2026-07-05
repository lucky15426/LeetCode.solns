class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n=nums.length;
        int bestl=nums[0];
        int max=0;
        for(int j=k;j<n;j++){
            bestl=Math.max(bestl,nums[j-k]);
            max=Math.max(max,bestl+nums[j]);
        }
        return max;
        
    }
}