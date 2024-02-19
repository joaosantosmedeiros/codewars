import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberToArrayOfDigits {
  public static int[] digitize(long n) {
    List<String> s = Arrays.asList(String.valueOf(n).split(""));
    Collections.reverse(s);
    return s.stream().mapToInt(i -> Integer.parseInt(i)).toArray();
  }
}

// MODO HARDCORE
// public class Kata {
// public static int[] digitize(long n) {
// String s = String.valueOf(n);
// int[] arr = new int[s.length()];
// for (int i = 0; i < arr.length; i++) {
// arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
// }

// for (int i = 0; i < arr.length / 2; i++) {
// int actualElement = arr[i];
// arr[i] = arr[arr.length - i - 1];
// arr[arr.length - i - 1] = actualElement;
// }

// return arr;
// }
// }