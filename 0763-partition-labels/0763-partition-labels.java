class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        List<Integer>res=new ArrayList<>();
        int size=0,end=0;
        for(int st=0;st<s.length();st++){
            end=Math.max(end,map.get(s.charAt(st)));
            size++;
            if(st==end){
                res.add(size);
                size=0;
            }
        }
        return res;
    }
}