class Solution {
    int dp[];
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        int diff=solve(stoneValue,0);
        if(diff>0)return "Alice";
        else if(diff<0)return "Bob";
        else return "Tie";
        
    }
    private int solve(int[]stoneValue,int i){
        int n=stoneValue.length;
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];

        int result=stoneValue[i]-solve(stoneValue,i+1);
        if (i+1<n){
            result=Math.max(result,stoneValue[i]+stoneValue[i+1]-solve(stoneValue,i+2));
        }
        if(i+2<n){
            result=Math.max(result,stoneValue[i]+stoneValue[i+1]+stoneValue[i+2]-solve(stoneValue,i+3));
        }
        return dp[i]= result;
    }
}