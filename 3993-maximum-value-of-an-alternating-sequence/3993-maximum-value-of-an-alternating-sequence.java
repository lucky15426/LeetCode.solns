class Solution {
    public long maximumValue(int n, int s, int m) {

        long d = (n - 1) / 2;

        if (n % 2 == 1) {
            return (long)s + d * (m - 1) + (n == 1 ? 0 : 1);
        }

        return (long)s + d * (m - 1) + m;
    }
}