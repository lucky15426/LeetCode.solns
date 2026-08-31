class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer>nums=new ArrayList<>();
        while(head!=null){
            nums.add(head.val);
            head=head.next;
        }
        int n=nums.size();
        List<Integer>hehe=new ArrayList<>();
        for(int i=1;i<n-1;i++){
            if(nums.get(i)>nums.get(i-1)&&nums.get(i)>nums.get(i+1)){
                hehe.add(i);
            }else if(nums.get(i)<nums.get(i-1)&&nums.get(i)<nums.get(i+1)){
                hehe.add(i);
            }
        }
        int m=hehe.size();
        if(m<2){
            return new int[]{-1,-1};
        }
        int max=0;
        for(int i=0;i<m;i++){
            max=hehe.get(m-1)-hehe.get(0);
        }
        int min=Integer.MAX_VALUE;
        for(int i=1;i<m;i++){
            min=Math.min(min,hehe.get(i)-hehe.get(i-1));
        }
        return new int[]{min,max};
    }
}