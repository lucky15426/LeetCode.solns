class Solution {
    public boolean validPalindrome(String s) {
        int l=0,r=s.length()-1;

        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return hehe(s,l+1,r)||hehe(s,l,r-1);

            }
            
            l++;
            r--;
        }
        return true;
        
    }
    private boolean hehe(String s,int l,int r){
        while(l<r){
        if(s.charAt(l)!=s.charAt(r))return false;

        l++;
        r--;

        }
 

        return true;
    }
}