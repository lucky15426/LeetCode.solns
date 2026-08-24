class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()<=1)return true;
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
           if(Character.isLetterOrDigit(ch)){
            sb.append(Character.toLowerCase(ch));
           }
        }
        int n=sb.length();
        for(int i=0;i<sb.length()/2;i++){

            if(sb.charAt(i)!=sb.charAt(n-1-i)){
                return false;
            }

        }
        return true;
        
    }
}