class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        

        int st=1;
        int end=0;
        int ans=0;

        for(int pile:piles){
            end=Math.max(pile,end);
        }

        while(st<=end){
            int mid=st+(end-st)/2;
            int hours=0;
            for(int pile:piles){
                hours+=Math.ceil((double)pile/mid);
            }

            if(hours<=h){
                ans=mid;
                end=mid-1;

            }else{
                st=mid+1;
            }
        }
        return ans;


        
    }
}