class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean dp[]=new boolean[n+1];

        dp[0]=true;

        for(int i=1;i<n+1;i++){
            for(String w:wordDict){
                int st=i-w.length();
                if(st>=0 && dp[st]==true && s.substring(st,i).equals(w)){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];


        
    }
}