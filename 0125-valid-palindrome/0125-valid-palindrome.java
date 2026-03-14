class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();

        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(Character.toLowerCase(c));
            }
            

        }
        String res= str.toString();

        int left=0;
        int right=res.length()-1;

        while(left<right){
            if(res.charAt(left)!=res.charAt(right)){
                return false;
                
            }
            left++;
            right--;
            
        }
        return true;
                
        
    }
}