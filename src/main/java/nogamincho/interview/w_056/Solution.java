package nogamincho.interview.w_056;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[][] merge(int[][] intervals) {

        List<Interval> intervalList = Interval.createIntervalList(intervals);

        while (true) {
            intervalList.sort(Comparator.comparingInt(a -> a.left));
            int listHashcode = intervalList.hashCode();
            for (int idx = 0; idx < intervalList.size() - 1; idx++) {
                Interval left = intervalList.get(idx);
                Interval right = intervalList.get(idx + 1);
                Interval checkedPair = left.checkInterval(right);
                if (checkedPair == null) {
                    continue;
                }

                intervalList.remove(left);
                intervalList.remove(right);
                intervalList.add(0, checkedPair);
                break;
            }
            if (listHashcode == intervalList.hashCode()) {
                break;
            }
        }
        List<int[]> collect = intervalList.stream().map(Interval::toArray).collect(Collectors.toList());
        int[][] result = new int[collect.size()][2];
        for (int i = 0; i < collect.size(); i++) {
            result[i] = collect.get(i);
        }
        return result;
    }
}

class Interval{
    final int left;
    final int right;

    public Interval(int left, int right) {
        this.left = left;
        this.right = right;
    }

    Interval checkInterval(Interval other) {
        if (!mergable(other)) {
            return null;
        }

        return new Interval(Math.min(this.left, other.left), Math.max(this.right, other.right));
    }

    boolean mergable(Interval other) {
//        if (left <= right && other.left <= other.right) return false;
        if((left <= other.left && other.right <= right)
                || (other.left <= left && right <= other.right)
        ) {
            return true;
        }

        if((left <= other.left && other.left <= right)
            || (other.left <= left && left <= other.right)
        ) {
            return true;
        }

        return false;
    }

    int[] toArray() {
        return new int[] {this.left, this.right};
    }

    static Interval of (int[] interval) {
        if (interval.length != 2) {
            throw new IllegalArgumentException();
        }
        return new Interval(interval[0], interval[1]);
    }

    static List<Interval> createIntervalList(int[][] intervals){
        return Arrays.stream(intervals)
                .map(Interval::of)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Interval{" + left +", "+ right + "}";
    }
}
//Example 1:
//
//        Input: [[1,3],[2,6],[8,10],[15,18]]
//        Output: [[1,6],[8,10],[15,18]]
//        Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
//Example 2:
//
//        Input: [[1,4],[4,5]]
//        Output: [[1,5]]
//        Explanation: Intervals [1,4] and [4,5] are considered overlapping.