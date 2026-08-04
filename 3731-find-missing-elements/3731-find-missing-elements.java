class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int l=nums[0],r=nums[nums.length-1];
        List<Integer>list=new ArrayList<>();
        while(l<=r){
            list.add(l);
            l++;

        }
        for(int num:nums){
            for(int i=0;i<list.size();i++){
                if(list.get(i)==num){
                    list.remove(list.get(i));
                }
            }
        }
        return list;
        
        
    }
}