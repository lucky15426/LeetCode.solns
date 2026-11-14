class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int l=0,r=height.length-1;
        while(l<r){
            int minH=Math.min(height[l],height[r]);
            int diff=r-l;
            max=Math.max((minH*diff),max);

            if(height[l]<=height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}