class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min=Integer.MAX_VALUE;
        

        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int landEnd=landStartTime[i]+landDuration[i];
                int waterStart=Math.max(landEnd,waterStartTime[j]);
                int total1=waterStart+waterDuration[j];


                int waterEnd=waterStartTime[j]+waterDuration[j];
                int landStart=Math.max(waterEnd,landStartTime[i]);
                int total2=landStart+landDuration[i];

                int ans=Math.min(total1,total2);
                min=Math.min(ans,min);

            }
            

        }
        return min;


    }
}