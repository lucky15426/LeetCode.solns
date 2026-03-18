class Solution {
    public int maxArea(int[] height) {
        
        
        
        int left=0;
        int right=height.length-1;
        int max=0;
  
         while(left<right){
                
            int maxEl=Math.min(height[left],height[right]);
            int diff=right-left;

            max=Math.max(max,(maxEl*diff));
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
            
        }
         return max;
    }
}