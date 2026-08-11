class Solution {
    public int missingInteger(int[] nums) {
       
        int sum=nums[0];
        for(int r=1;r<nums.length;r++){            
            if(nums[r]==nums[r-1]+1){
                sum+=nums[r];
            }else{
                break;
            }
        }
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;


        
    }
}