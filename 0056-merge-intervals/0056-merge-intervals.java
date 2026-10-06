class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]>res=new ArrayList<>();

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=intervals[i-1][1]){
                intervals[i][0]=Math.min(intervals[i][0],intervals[i-1][0]);
                intervals[i][1]=Math.max(intervals[i][1],intervals[i-1][1]);
                
                
                
            }else{
                res.add(intervals[i-1]);
                
                
            }
            
            
        }
        res.add(intervals[intervals.length-1]);
        
        return res.toArray(new int[res.size()][]);
    }
}