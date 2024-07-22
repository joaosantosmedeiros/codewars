// https://www.codewars.com/kata/5a53a17bfd56cb9c14000003

import java.util.Arrays;
import java.util.stream.IntStream;

public class DisariumNumber {
  public static String disariumNumber(int number) {
    int[] digits = Arrays.stream((number + "").split("")).mapToInt(i -> Integer.parseInt(i)).toArray();
    int sum = IntStream.rangeClosed(0, digits.length - 1).map(i -> (int) Math.pow(digits[i], i + 1)).sum();
    return sum == number ? "Disarium !!" : "Not !!";
  }
}