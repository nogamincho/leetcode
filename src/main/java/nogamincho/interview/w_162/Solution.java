package nogamincho.interview.w_162;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int findPeakElement(int[] nums) {
        List<Integer> arrayList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int i = Arrays.stream(nums).max().orElse(Integer.MIN_VALUE);


        return arrayList.lastIndexOf(i);

    }
}