class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];

        return Math.max(HouseRobber1(nums,0,n-2),HouseRobber1(nums,1,n-1));
        
        
    }
    private int HouseRobber1(int[]nums,int st,int end){
        int n=end-st+1;
        int dp[]=new int[n];

        if(n==1)return nums[st];
        dp[0]=nums[st];
        dp[1]=Math.max(nums[st],nums[st+1]);

        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[st+i]);
        }
        return dp[n-1];
    }
}