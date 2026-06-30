class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer>map=new HashMap<>();

        int l=0,count=0;
        for(int r=0;r<s.length();r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);

            while(map.getOrDefault('a',0)>0 && map.getOrDefault('b',0)>0 && map.getOrDefault('c',0)>0){
                count+=s.length()-r;

                char charLeft=s.charAt(l);
                map.put(charLeft,map.get(charLeft)-1);
                l++;
            }

        }
        return count;
        
    }
}