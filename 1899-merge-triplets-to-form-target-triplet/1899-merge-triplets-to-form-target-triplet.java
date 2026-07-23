class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int hehe[]=new int[3];
        boolean ans=false;

        for(int t[]:triplets){
            if(t[0]<= target[0] && t[1]<=target[1] && t[2]<=target[2]){
                hehe[0]=Math.max(hehe[0],t[0]);
                hehe[1]=Math.max(hehe[1],t[1]);
                hehe[2]=Math.max(hehe[2],t[2]);
            }
        }
        for(int i=0;i<3;i++){
            if(hehe[i]!=target[i]){
                return false;
            }
        }
        return true;
        
    }
}