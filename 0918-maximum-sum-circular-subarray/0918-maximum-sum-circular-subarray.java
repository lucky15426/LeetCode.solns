class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int tSum=0;
        int currmax=0,currmin=0;
        int maxSum=nums[0];
        int minSum=nums[0];

        for(int num:nums){
            currmax=Math.max(num,currmax+num);
            maxSum=Math.max(currmax,maxSum);

            currmin=Math.min(num,currmin+num);
            minSum=Math.min(minSum,currmin);

            tSum+=num;
        }
        if(maxSum<0)return maxSum;

        return Math.max(maxSum,tSum-minSum);

    }
}