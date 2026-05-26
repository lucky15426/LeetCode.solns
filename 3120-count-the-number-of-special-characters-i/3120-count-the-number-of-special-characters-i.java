class Solution {
    public int numberOfSpecialChars(String word) {
        int n=word.length();
        int count=0;

        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

        }

        HashSet<Character>seen = new HashSet<>();

        for(int j=0;j<n;j++){
            char ch=word.charAt(j);
            char up=Character.toUpperCase(ch);

        if(Character.isLowerCase(ch) && map.containsKey(up) && !seen.contains(ch)){
            count++;
            seen.add(ch);
        }


            
        }
        return count;
        
    }
}