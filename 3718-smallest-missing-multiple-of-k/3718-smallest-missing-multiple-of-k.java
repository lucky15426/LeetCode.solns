class Solution {
    public int missingMultiple(int[] nums, int k) {
      
        int ele=k;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        while(map.get(ele)!=null){
            ele+=k;
        }
        return ele;

    }
}