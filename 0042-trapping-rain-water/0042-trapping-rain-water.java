class Solution {
    public int trap(int[] height) {
        if(height==null || height.length==0)return 0;
        int left=0;
        int n=height.length;
        int right=n-1;
        int score=0;
        int leftMax=height[left];
        int rightMax=height[right];

        while(left<right){
            if(leftMax<rightMax){
                left++;
                leftMax=Math.max(leftMax,height[left]);
                score+=leftMax-height[left];

            }else{
                right--;
                rightMax=Math.max(rightMax,height[right]);
                score+=rightMax-height[right];
            }
        }
        return score;

        
    }
}