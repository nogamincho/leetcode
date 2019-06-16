package nogamincho.w_070;

class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        return recurse(0, n,memo);
    }

    public int recurse(int i, int n, int[] memo) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (memo[i] > 0) {
            return memo[i];
        }
        memo[i] = recurse(i + 1, n, memo) + recurse(i + 2, n, memo);
        return memo[i];
    }
}