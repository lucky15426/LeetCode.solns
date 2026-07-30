class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int max=Integer.MIN_VALUE;
        if(n<=8)return n;

        if(n>8)max=Math.max(max,(n-8)*2+8) ;
        if(n>16)max=(n-16)+Math.max(max,(n-8)*2+8);
        if(n>24)max=(n-24)+Math.max(max,(n-8)*2+8);
   

        return max;
        
        
    }
}