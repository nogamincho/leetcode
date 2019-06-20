
package nogamincho.sequential.w_198;
class Solution {
    public int rob(int[] nums) {
        int result_even = 0;
        int result_odd = 0;

        for (int num : nums) {
            result_odd = Math.max(num,result_even);
            result_even = result_odd + num;
        }

        return Math.max(result_even, result_odd);
    }
}
//1軒目で強盗した場合の最大獲得金額 = 0軒目で強盗しなかった場合の最大金額 + 1軒目の家での獲得金額
//1軒目で強盗しなかった場合の最大獲得金額 = 0件目で強盗した場合としなかった場合の金額の大きい方