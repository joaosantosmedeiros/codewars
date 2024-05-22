// https://www.codewars.com/kata/578553c3a1b8d5c40300037c

import java.util.List;
import java.util.stream.Collectors;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String binaryString = String.join("", binary.stream().map(b -> String.valueOf(b)).collect(Collectors.toList()).toArray(new String[0]));
        return Integer.parseInt(binaryString, 2);
    }
}