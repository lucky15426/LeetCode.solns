class Solution {
    public int trap(int[] height) {
        int score=0;
        int l=0,r=height.length-1;
        int lMax=height[l],rMax=height[r];

        while(l<r){
            if(lMax<rMax){
                l++;
                lMax=Math.max(lMax,height[l]);
                score+=lMax-height[l];
            }else{
                r--;
                rMax=Math.max(rMax,height[r]);
                score+=rMax-height[r];
                }
        }
        return score;

    }
}