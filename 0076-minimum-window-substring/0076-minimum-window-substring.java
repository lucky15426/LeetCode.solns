class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())return "";
        HashMap<Character,Integer>map=new HashMap<>();
        
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }

        int left=0;
        int count=t.length();
        int start=0;
        int minLen=Integer.MAX_VALUE;

        for(int right=0;right<s.length();right++){
            char rChar=s.charAt(right);
            if(map.containsKey(rChar)){
                map.put(rChar,map.get(rChar)-1);
                if(map.get(rChar)>=0){
                    count--;
                }
            }
            while(count==0){
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    start=left;
                }
                 char lChar=s.charAt(left);
                 if(map.containsKey(lChar)){
                    map.put(lChar,map.get(lChar)+1);
                    if(map.get(lChar)>0){
                        count++;
                    }
                   
                 }
                  left++;


            }
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    
    }
}