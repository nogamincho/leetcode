package nogamincho.w_001;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = nums.length-1; i>0; i--) {
            for (int j=i-1; j>=0; j--) {
                if (nums[i] + nums[j] == target) {
                    int[] result = {j, i};
                    return result;
                }
            }
        }
        throw new RuntimeException();
    }
}