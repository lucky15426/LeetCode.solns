class Solution {
    public int maxDigitRange(int[] nums) {
        
        int maxRange=0;
        
        int sum=0;

        for(int i=0;i<nums.length;i++){

        int maxel=Integer.MIN_VALUE;
        int minel=Integer.MAX_VALUE;
        int temp=nums[i];
            
            while(temp>0){

                int el=temp%10;
                temp=temp/10;
                maxel=Math.max(el,maxel);
                minel=Math.min(el,minel);
                
                
            }
            maxRange=Math.max(maxRange,maxel-minel);
        }
            
        for(int i=0;i<nums.length;i++){
        int maxel=Integer.MIN_VALUE;
        int minel=Integer.MAX_VALUE;
        int temp=nums[i];
            while(temp>0){
                int el=temp%10;
                temp=temp/10;
                maxel=Math.max(el,maxel);
                minel=Math.min(el,minel);

                
            }
            if((maxel-minel)==maxRange){
                    sum+=nums[i];
                }
        }    
   
        
        return sum;
        
    }
}