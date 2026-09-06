class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int tSum=nums[0];
        int maxSum=nums[0],minSum=nums[0];
        int currMax=nums[0],currMin=nums[0];

        for(int i=1;i<nums.length;i++){
            currMax=Math.max(nums[i],currMax+nums[i]);
            maxSum=Math.max(currMax,maxSum);

            currMin=Math.min(nums[i],currMin+nums[i]);
            minSum=Math.min(currMin,minSum);

            tSum+=nums[i];
        }
        if(maxSum<0)return maxSum;

        return Math.max(maxSum,tSum-minSum);
    }
}