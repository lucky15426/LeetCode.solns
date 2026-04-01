class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();

        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(Character.toLowerCase(c));
            }
            

        }
        String hehe=str.toString();
       StringBuilder rev=new StringBuilder(hehe).reverse();

       if(str.toString().equals(rev.toString())){
        return true;
       }return false;
                
        
    }
}