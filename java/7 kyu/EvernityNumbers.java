// https://www.codewars.com/kata/5b93f268563417c7ed0001bd
import java.util.stream.IntStream;
import java.util.Arrays;

class EvernityNumbers {
  public static int solve(int a, int b) {
    var numbers = IntStream.rangeClosed(a, b)
        .filter(n -> (!(n + "").contains("0")) && (!(n + "").contains("1")) && (!(n + "").contains("2"))
            && (!(n + "").contains("4")) && (!(n + "").contains("6")) && (!(n + "").contains("7"))
            && (!(n + "").contains("9")))
        .toArray();
    int count = 0;
    for (int i = 0; i < numbers.length; i++) {
      int[] digits = Arrays.stream((numbers[i] + "").split("")).mapToInt(digit -> Integer.parseInt(digit)).toArray();

      int eigth = (int) Arrays.stream(digits).filter(digit -> digit == 8).count();
      int five = (int) Arrays.stream(digits).filter(digit -> digit == 5).count();
      int three = (int) Arrays.stream(digits).filter(digit -> digit == 3).count();

      count += eigth >= five && five >= three ? 1 : 0;
    }
    return count;
  }
}