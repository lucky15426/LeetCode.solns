class Solution {
    public int minAddToMakeValid(String s) {
        int l=0,h=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                l++;
            }else if(s.charAt(i)==')'){
                if(l>0){
                    l--;
                }else{
                    h++;
                }
            }
        }
        return l+h;
    }
}