package nogamincho.interview.w_066;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public int[] plusOne(int[] digits) {
//        String integerStr = Arrays.stream(digits).mapToObj(i -> "" + i).collect(Collectors.joining());
        String addedValue = Arrays.stream(digits).mapToObj(i -> "" + i)
                .reduce((a, b) -> a + b)
                .map(BigInteger::new)
                .map(bigInteger -> bigInteger.add(BigInteger.ONE))
                .get().toString();
        return Stream.of(addedValue)
                .flatMap((String str) -> Stream.of(str.split("")))
                .mapToInt(Integer::parseInt)
                .toArray();

//        return Arrays.stream(digits).mapToObj(i -> "" + i)
//                .reduce((a, b) -> a + b)
//                .map(Integer::parseInt)
//                .map(i -> Integer.toString(i + 1))
//                .stream()
//                .flatMap((String str) -> Stream.of(str.split("")))
//                .mapToInt(Integer::parseInt)
//                .toArray();
    }
}