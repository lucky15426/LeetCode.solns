class Solution {
    public int scoreOfParentheses(String s) {
        int count=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                l++;
            }else {
                
                l--;

                if(s.charAt(i-1)=='('){
                    count+=1<<l;
                }
                

            }

        }
        return count;

    }
}