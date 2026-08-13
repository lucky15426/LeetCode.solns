class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        ArrayList<int[]>res=new ArrayList<>();

        int []curr=intervals[0];

        for(int i=1;i<n;i++){
            
            int next[]=intervals[i];

            if(curr[1]>=next[0]){
                curr[1]=Math.max(curr[1],next[1]);
            }else{
                res.add(curr);
                curr=next;
            }

            
            
            
            
        }
        res.add(curr);
        return res.toArray(new int[res.size()][]);

    }
}