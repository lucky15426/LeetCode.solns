class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        
        for(int right=1;right<numbers.length;right++ ){
            while(left<right){
                if((numbers[left]+numbers[right])==target){
                return new int[]{left+1,right+1};
               
            }
            left++;

            }
            left=0;
               

        }return new int[]{-1,-1};
        

        
        
    }
}