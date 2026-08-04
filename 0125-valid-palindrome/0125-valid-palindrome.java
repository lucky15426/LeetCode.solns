class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder s1=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                s1.append(Character.toLowerCase(ch));
            }
        }
        StringBuilder rev=new StringBuilder(s1).reverse();
        return s1.toString().equals(rev.toString());

             
    }
}