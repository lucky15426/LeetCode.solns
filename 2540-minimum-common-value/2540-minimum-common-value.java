class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);

        }
        for(int j=0;j<nums2.length;j++){
            if(map.containsKey(nums2[j])){
                return nums2[j];
            }
        }
        return -1;
        

        
    }
}