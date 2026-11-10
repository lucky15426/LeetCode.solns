class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        

        for(int i=0;i<arr1.length;i++){
            int far=Integer.MAX_VALUE;
            for(int j=0;j<arr2.length;j++){
                far=Math.min(far,Math.abs(arr1[i]-arr2[j]));
            }
            if(far>d){
                count++;
            }
            
        }
        return count;
    }
}