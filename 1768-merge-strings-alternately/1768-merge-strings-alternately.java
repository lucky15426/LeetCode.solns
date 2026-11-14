class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int l=0;
        int r=Math.max(word1.length(),word2.length());

        while(l<r){
            if(l<word1.length()){
                sb.append(word1.charAt(l));
            }
            if(l<word2.length()){
                sb.append(word2.charAt(l));
            }
            l++;
            
        }
        return sb.toString();

    }
}