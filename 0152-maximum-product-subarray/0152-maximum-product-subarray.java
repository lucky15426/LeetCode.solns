class Solution {
    public int maxProduct(int[] nums) {
        int res=nums[0];

        int currMax=1,currMin=1;

        for(int num:nums){
            int temp=num*currMax;

            currMax=Math.max(Math.max(num*currMax,num*currMin),num);
            currMin=Math.min(Math.min(temp,num*currMin),num);
            res=Math.max(currMax,res);
        }
        return res;
    }
}