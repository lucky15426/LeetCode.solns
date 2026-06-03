import java.util.*;

class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, 
                                  int[] waterStartTime, int[] waterDuration) {
        
        int minTime = Integer.MAX_VALUE;

        // Find the index of the earliest finishing land task
        int bestLandIdx = 0;
        int minLandEnd = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            int end = landStartTime[i] + landDuration[i];
            if (end < minLandEnd) {
                minLandEnd = end;
                bestLandIdx = i;
            }
        }

        // Find the index of the earliest finishing water task
        int bestWaterIdx = 0;
        int minWaterEnd = Integer.MAX_VALUE;
        for (int i = 0; i < waterStartTime.length; i++) {
            int end = waterStartTime[i] + waterDuration[i];
            if (end < minWaterEnd) {
                minWaterEnd = end;
                bestWaterIdx = i;
            }
        }

        Set<String> checkedPairs = new HashSet<>();

        // Check all land tasks with the best water task
        for (int i = 0; i < landStartTime.length; i++) {
            int time = computeTime(i, bestWaterIdx, checkedPairs,
                                   landStartTime, landDuration,
                                   waterStartTime, waterDuration);
            minTime = Math.min(minTime, time);
        }

        // Check all water tasks with the best land task
        for (int j = 0; j < waterStartTime.length; j++) {
            int time = computeTime(bestLandIdx, j, checkedPairs,
                                   landStartTime, landDuration,
                                   waterStartTime, waterDuration);
            minTime = Math.min(minTime, time);
        }

        return minTime;
    }

    // Helper function to compute the minimum finish time between land[i] and water[j]
    private int computeTime(int landIdx, int waterIdx, Set<String> checkedPairs,
        int[] landStartTime, int[] landDuration,
        int[] waterStartTime, int[] waterDuration) {

        String key = landIdx + "," + waterIdx;
        if (checkedPairs.contains(key)) return Integer.MAX_VALUE;
        checkedPairs.add(key);

        int landStart = landStartTime[landIdx];
        int landDur = landDuration[landIdx];
        int landEnd = landStart + landDur;

        int waterStart = waterStartTime[waterIdx];
        int waterDur = waterDuration[waterIdx];
        int waterEnd = waterStart + waterDur;

        // Case 1: Land first, then water
        int afterLand = Math.max(landEnd, waterStart);
        int total1 = afterLand + waterDur;

        // Case 2: Water first, then land
        int afterWater = Math.max(waterEnd, landStart);
        int total2 = afterWater + landDur;

        return Math.min(total1, total2);
    }
}
