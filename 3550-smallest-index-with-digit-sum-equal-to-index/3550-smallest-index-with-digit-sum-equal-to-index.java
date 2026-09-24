class Solution {
    public int smallestIndex(int[] nums) {
        int max=-1;
        
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]>0){
            int ele=nums[i]%10;
            sum+=ele;
            nums[i]/=10;
            
            }
            if(sum==i){
                max=Math.max(max,sum);
                break;
            }
            
        }
        return max;
        
    }
}