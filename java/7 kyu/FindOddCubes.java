// https://www.codewars.com/kata/580dda86c40fa6c45f00028a
import java.util.stream.IntStream;

public class FindOddCubes {

  public static int cubeOdd(int arr[]) {
    return IntStream.of(arr).map(i -> i * i * i).filter(n -> n % 2 != 0).sum();
  }
}