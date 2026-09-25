class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        for (int num : map.keySet()) {
            ArrayList<Integer> list = map.get(num);

            if (list.size() == 3) {
                if (list.get(1) - list.get(0) == list.get(2) - list.get(1)) {
                    count++;
                }
            }
        }

        return count;
    }
}