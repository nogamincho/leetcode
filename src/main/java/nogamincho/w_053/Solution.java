package nogamincho.w_053;

class Solution {
    public int maxSubArray(int[] nums) {
        int length = nums.length;

        if (length == 1) {
            return nums[0];
        }

        int maxLocal = nums[0];
        int maxGlobal = nums[0];

        for (int idx = 1; idx < length; idx++) {
            maxLocal = Math.max(nums[idx], maxLocal + nums[idx]);
            maxGlobal = Math.max(maxLocal,maxGlobal);
        }
        return maxGlobal;
    }
}