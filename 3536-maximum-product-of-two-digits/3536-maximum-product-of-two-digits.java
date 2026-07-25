class Solution {
    public int maxProduct(int n) {
        if(n==100 || n==1000000000)return 0;
        List<Integer>list=new ArrayList<>();
        int max=1;
        while(n>0){
            int ele=n%10;
            list.add(ele);
            n/=10;

        }
        if(list.size()==2){
            return list.get(0)*list.get(1);
        }else{
            Collections.sort(list);
            max=Math.max(max,list.get(list.size()-1)*list.get(list.size()-2)) ;
            
        }
        return max;
        
        
    }
}