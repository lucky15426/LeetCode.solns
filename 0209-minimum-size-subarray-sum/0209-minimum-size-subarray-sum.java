class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int minl=Integer.MAX_VALUE;
        int sum=0;

        for(int r=0;r<nums.length;r++){
            sum+=nums[r];

            while (sum >= target){
                minl=Math.min( minl , r-left+1);

                sum-=nums[left];
                left++;
            }
            
        }
        return (minl==Integer.MAX_VALUE) ? 0 : minl;
        
    }
}