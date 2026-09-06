class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        long sum=0,ans=0;
        for(int i=0,j=0;j<nums.length;j++){
            sum+=nums[j];
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);

            if(j-i+1>k){
                sum-=nums[i];
                
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0)map.remove(nums[i]);
                i++;
            }

            if(j-i+1==k && map.size()==k){
                ans=Math.max(sum,ans);

            }
        }
        return ans;
    }
}