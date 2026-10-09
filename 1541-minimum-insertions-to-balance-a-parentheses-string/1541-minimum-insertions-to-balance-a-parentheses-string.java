class Solution {
    public int minInsertions(String s) {
        int low = 0;
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                low += 2;

                if (low % 2 != 0) {
                    res++;
                    low--;
                }
            } else {
                low--;

                if (low < 0) {
                    res++;
                    low = 1;
                }
            }
        }

        return res + low;
    }
}