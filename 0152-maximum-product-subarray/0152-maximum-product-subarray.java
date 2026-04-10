class Solution {
    public int maxProduct(int[] nums) {
        int res=nums[0];

        int currMax=1,currMin=1;

        for(int num:nums){
            int temp=num*currMax;
            int temp2=num*currMin;

            currMax=Math.max(Math.max(temp,temp2),num);
            currMin=Math.min(Math.min(temp,temp2),num);
            res=Math.max(currMax,res);
        }
        return res;
    }
}