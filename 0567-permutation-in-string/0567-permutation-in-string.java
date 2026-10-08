class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer>map1=new HashMap<>();
        for(char ch:s1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);

        }
        int l=0;
        
        int n=s2.length();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(int r=0;r<n;r++){
            map2.put(s2.charAt(r),map2.getOrDefault(s2.charAt(r),0)+1);

            if(r-l+1>s1.length()){
                map2.put(s2.charAt(l),map2.get(s2.charAt(l))-1);
                
                if(map2.get(s2.charAt(l))==0){
                    map2.remove(s2.charAt(l));
                }
                l++;
            }
            if(r-l+1==s1.length() && map1.equals(map2)){
                return true;
            }

        }
     

        return false;
    }
}