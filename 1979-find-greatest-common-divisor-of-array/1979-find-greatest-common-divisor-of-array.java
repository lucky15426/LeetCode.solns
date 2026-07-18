class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        
        int ele=1;
        
        for(int i=nums[n-1];i>=1;i--){
            if(nums[n-1]%i==0&&nums[0]%i==0){
                ele=Math.max(i,ele);
            }

        }
        return ele;
    }
}