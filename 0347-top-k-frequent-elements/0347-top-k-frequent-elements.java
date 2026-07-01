class pair implements Comparable<pair> {
    int ele;
    int freq;

    pair(int ele, int freq) {
        this.ele = ele;
        this.freq = freq;
    }

    public int compareTo(pair p) {
        if (this.freq == p.freq) return this.ele - p.ele;
        return this.freq - p.freq; // min heap by frequency
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        PriorityQueue<pair> pq = new PriorityQueue<>();

        for (int key : map.keySet()) {
            int freq = map.get(key);
            pq.add(new pair(key, freq));

            if (pq.size() > k) {
                pq.remove();
            }
        }

        int[] ans = new int[k];
        int i = 0;

        while (pq.size() > 0) {
            pair x = pq.remove();
            ans[i] = x.ele;
            i++;
        }

        return ans;
    }
}