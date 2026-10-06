class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int res=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            res=Math.max(res,r-l+1);
            
        }
        return res;
        
    }
}