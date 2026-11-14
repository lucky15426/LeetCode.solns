class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length();
        int left=0;
        int right=n-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return (isValidPalindrome(left,right-1,s)||isValidPalindrome(left+1,right,s));

            }
            left++;
            right--;
        }return true;
        
        
        
    }
    private boolean isValidPalindrome(int l,int r,String s){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}