class Solution {
    public int leastInterval(char[] tasks, int n) {
        int count[]=new int[26];
        for(char task:tasks){
            count[task-'A']++;
        }

        int maxFreq=0;

        for(int freq:count){
            maxFreq=Math.max(maxFreq,freq);

        }
        int maxFreqCount=0;
        for(int freq:count){
            if(freq==maxFreq){
                maxFreqCount++;
            }
        }

        int ans=(maxFreq-1)*(n+1)+maxFreqCount;

        return Math.max(tasks.length,ans);
        
    }
}