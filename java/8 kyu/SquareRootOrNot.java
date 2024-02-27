// https://www.codewars.com/kata/57f6ad55cca6e045d2000627
import java.util.Arrays;

public class SquareRootOrNot {
  public static int[] squareOrSquareRoot(int[] array) {
    return Arrays.stream(array).map(numb -> Math.sqrt(numb) % 1 == 0 ? (int) Math.sqrt(numb) : numb * numb).toArray();
  }
}