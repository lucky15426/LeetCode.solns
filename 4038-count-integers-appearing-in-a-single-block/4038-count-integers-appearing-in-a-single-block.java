class Solution {
    public int countSpecialIntegers(int[] nums) {
        if(nums.length==1)return 1;
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        set.add(nums[0]);
        
        for(int i=1;i<n;i++){
            if(nums[i-1]!=nums[i]){
                if(set.contains(nums[i])){
                    set.remove(nums[i]);
                    set2.add(nums[i]);
                
            }else if (!set2.contains(nums[i])){
                set.add(nums[i]);
            }
        }
    }
       

        return set.size();
    }
}