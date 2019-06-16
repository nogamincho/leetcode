package nogamincho.w_027;

class Solution {
//    Given nums = [3,2,2,3], val = 3,
    public int removeElement(int[] nums, int val) {
        int moveCount = 0;
        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] == val) {
                moveCount++;
            } else {
                nums[idx - moveCount] = nums[idx];
            }
        }
        return nums.length - moveCount;
    }
}