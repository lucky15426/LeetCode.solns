class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0])return Integer.compare(b[1],a[1]);
            else return Integer.compare(a[0],b[0]);
        });

        int n=intervals.length;
        int count=0;
        int maxend=0;

        for(int i=0;i<n;i++){
            
                if(intervals[i][1]>maxend){
                    count++;
                    maxend=intervals[i][1];
                }
            
        }
        return count;
        
    }
}