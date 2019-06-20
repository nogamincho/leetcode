package nogamincho.sequential.w_088;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tmp = 0;
        int maxIndex = m-1;
        for (int i = n-1; i >= 0;) {
            System.out.println("maxIndex:" + maxIndex + "/ i:" + i +"/ m+i:"+ (m+i) +"/ maxIndex+i:"+ (maxIndex+i));
            if (nums1[maxIndex] > nums2[i]) {
                tmp = nums1[m+i];
                nums1[m+i] = nums1[maxIndex];
                nums1[maxIndex] = tmp;
                maxIndex--;
                System.out.println("if  :"+Arrays.stream(nums1).mapToObj(in -> "" + in).collect(Collectors.joining()));
            } else if (nums1[maxIndex] == nums2[i]) {
                nums1[maxIndex+1] = nums1[maxIndex];
                maxIndex--;
                System.out.println("elif:"+Arrays.stream(nums1).mapToObj(in -> "" + in).collect(Collectors.joining()));
            } else {
                if (maxIndex+i == 0)
                    break;
                nums1[m+i] = nums2[i];
                System.out.println("else:"+Arrays.stream(nums1).mapToObj(in -> "" + in).collect(Collectors.joining()));
                i--;
            }
            System.out.println("maxIndex:" + maxIndex + "/ i:" + i +"/ m+i:"+ (m+i) +"/ maxIndex+i:"+ (maxIndex+i));
        }
    }
}