class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int x=nums[nums.length/2];
        if(map.get(x)>1){
            return false;

        }
        return true;
    }
}