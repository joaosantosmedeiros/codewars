import java.util.Arrays;

public class MaxTriSum{
  public static int maxTriSum (int[] numbers){
    numbers = Arrays.stream(numbers).distinct().toArray();
    Arrays.sort(numbers);
    return numbers[numbers.length - 1] + numbers[numbers.length - 2] + numbers[numbers.length - 3];
  }
}