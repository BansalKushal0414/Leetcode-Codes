class Solution {
    long mod = 1000000007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long ans = (pow(5, even) * pow(4, odd)) % mod;
        return (int) ans;
    }

    private long pow(long x, long n) {
        long res = 1;

        while (n > 0) {
            if ((n & 1) == 1) {
                res = (res * x) % mod;
            }
            x = (x * x) % mod;
            n >>= 1;
        }

        return res;
    }
}