class Solution {
    public int numOfWays(int n) {
        final int mod = 1_000_000_007;
        long count2 = 6, count3 = 6;
        for (int i = 1; i < n; i++){
            long new2 = (3 * count2 + 2 * count3) % mod;
            long new3 = (2 * count2 + 2 * count3) % mod;
            count2 = new2;
            count3 = new3;
        }
        return (int)((count2 + count3) % mod);
    }
}