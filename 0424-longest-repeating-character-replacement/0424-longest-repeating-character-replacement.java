class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int maxl=0;
        int maxf=0;

        HashMap<Character,Integer>map=new HashMap<>();
        for(int r=0;r<s.length();r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            maxf=Math.max(maxf,map.get(s.charAt(r)));

            if(r-l+1-maxf>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            maxl=Math.max(maxl,r-l+1);
        }
        return maxl;


    }
}