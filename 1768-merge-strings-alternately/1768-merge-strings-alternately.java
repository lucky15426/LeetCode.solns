class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int l=0,r=0;
        int n1=word1.length();
        int n2=word2.length();

        while(l<n1 || r<n2){
            if(l<n1)sb.append(word1.charAt(l));
            l++;
        
            if(r<n2)sb.append(word2.charAt(r));
            r++;

        }
            
        return sb.toString();
    }
}