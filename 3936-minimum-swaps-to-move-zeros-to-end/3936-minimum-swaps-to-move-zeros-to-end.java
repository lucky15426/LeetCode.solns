class Solution {
    public int minimumSwaps(int[] nums) {
        int count=0;
        for(int num:nums){
            if(num==0){
                count++;
            }
        }
        for(int i=nums.length-count;i<nums.length;i++){
            if(nums[i]==0){
                count--;
            }
        }
        return count;
        
    }
}