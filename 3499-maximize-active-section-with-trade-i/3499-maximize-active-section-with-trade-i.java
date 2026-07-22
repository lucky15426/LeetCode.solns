class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int activeSum=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1')activeSum++;
        }

        List<Integer>inactiveSum=new ArrayList<>();
        int i=0;
        while(i<n){
            if(s.charAt(i)=='0'){
                int start=i;
                while(i<n && s.charAt(i)=='0')i++;
                inactiveSum.add(i-start);
                    
                
            }else{
                i++;
                
            }
            
            
        }
        

        int hehe=0;
        for(int j=1;j<inactiveSum.size();j++){
            hehe=Math.max(hehe,inactiveSum.get(j)+inactiveSum.get(j-1));
        }
        return activeSum+hehe;
        
    }
}