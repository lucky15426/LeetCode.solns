class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int max=1,min=1;

        for(int num:nums){
            int temp1=num*max;
            int temp2=num*min;

            max=Math.max(Math.max(temp1,temp2),num);
            min=Math.min(Math.min(temp1,temp2),num);
            ans=Math.max(ans,max);
        }
        return ans;
    }
}