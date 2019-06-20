package nogamincho.sequential.w_136;

class Solution {
//    Example 1:
//
//    Input: [2,2,1]
//    Output: 1
//    Example 2:
//
//    Input: [4,1,2,1,2]
//    Output: 4
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int num : nums) {
            a ^= num;
        }
        return a;
    }

}