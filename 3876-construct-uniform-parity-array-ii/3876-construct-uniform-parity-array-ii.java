class Solution {
    public boolean uniformArray(int[] nums1) {
       int n=nums1.length;
       

       int odd=Integer.MAX_VALUE;
       int even=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
        if(nums1[i]%2==0){
            even=Math.min(even,nums1[i]);
        }else{
            odd=Math.min(odd,nums1[i]);
        }

       }
       if(even==Integer.MAX_VALUE || odd==Integer.MAX_VALUE)return true;
       if(even<odd){
        return false;
        }else{
            return true;

        }

       

    }
}