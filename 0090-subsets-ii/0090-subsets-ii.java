class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>result=new ArrayList<>();
        result.add(new ArrayList<>());

        int st=0,end=0;

        for(int i=0;i<nums.length;i++){
            st=0;
            

            if(i>0 && nums[i]==nums[i-1]){
                st=end+1;
            }
            end=result.size()-1;

            int size=result.size();

            for(int j=st;j<size;j++){
                List<Integer>temp=new ArrayList<>(result.get(j));
                temp.add(nums[i]);
                result.add(temp);

            }
        }
        return result;
        
    }
}