class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int element=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                element=Math.min(element,nums[i]);
            }
        }
        return element;
        
    }
}