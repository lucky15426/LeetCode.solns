class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1)return x;
        int st=0,end=x;
        while(st<=end){
            int mid=st+(end-st)/2;
            if((long)mid*(long)mid>x){
                end=mid-1;
            }else if((long)mid*(long)mid==x){
                return mid;
            }else{
                st=mid+1;
            }
        }
        return Math.round(end);
    }
}