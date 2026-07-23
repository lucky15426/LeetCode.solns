class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        int n=nums.length;
        if(n%k!=0)return false;

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        Arrays.sort(nums);
        for(int num:nums){
            if(map.get(num)>0){

         
        for(int i=num;i<num+k;i++){
            if(!map.containsKey(i)|| map.get(i)==0)return false;
            else{
               
                map.put(i,map.get(i)-1);
            }
            
        }

           }
        }

        return true;

        
    }
}