package nogamincho.w_026;

class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 0;
        int length = nums.length;
        if (length == 0)
            return 0;

        int lastNum = nums[0]-1;
        // int lastValidIndex = 0;
        for (int i=0; i < length; i++) {
            if (lastNum == nums[i]) {
                // doNothing
            } else {
                lastNum = nums[i];
                nums[result++] = nums[i];
            }
        }
        return result;
    }
}