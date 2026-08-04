class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int max=1;
        for(int num:nums){
            if(num<max){
                continue;
            }
            if(num==max){
                max++;
            }else if(num>max){
                return max;
            }
        }
        return max;
        
    }
}