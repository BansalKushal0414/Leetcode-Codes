class Solution {

    int[][] memo;

    public int superEggDrop(int k, int n) {
        memo = new int[k + 1][n + 1];
        return solve(k, n);
    }

    private int solve(int k, int n) {

        if (n == 0 || n == 1) return n;
        if (k == 1) return n;

        if (memo[k][n] != 0) return memo[k][n];

        int left = 1;
        int right = n;
        int ans = Integer.MAX_VALUE;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int breakCase = solve(k - 1, mid - 1);
            int notBreak = solve(k, n - mid);

            int worst = 1 + Math.max(breakCase, notBreak);

            ans = Math.min(ans, worst);

            if (breakCase > notBreak) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        memo[k][n] = ans;
        return ans;
    }
}