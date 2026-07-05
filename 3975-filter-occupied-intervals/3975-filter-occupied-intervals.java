class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
       Arrays.sort(occupiedIntervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        int s = occupiedIntervals[0][0];
        int e = occupiedIntervals[0][1];

        for(int i = 1; i < occupiedIntervals.length; i++){
            if((long) occupiedIntervals[i][0] <= (long) e + 1){
                e = Math.max(e, occupiedIntervals[i][1]);
            } else {
                merged.add(new int[]{s, e});
                s = occupiedIntervals[i][0];
                e = occupiedIntervals[i][1];
            }
        }

        merged.add(new int[]{s, e});

        List<List<Integer>> res = new ArrayList<>();

        for(int[] in : merged){
            int l = in[0];
            int r = in[1];

            if(r < freeStart || l > freeEnd){
                res.add(Arrays.asList(l, r));
            } else {
                if(l < freeStart){
                    res.add(Arrays.asList(l, freeStart - 1));
                } if(r > freeEnd){
                    res.add(Arrays.asList(freeEnd + 1, r));
                }
            }
        }

        return res;
    }
}