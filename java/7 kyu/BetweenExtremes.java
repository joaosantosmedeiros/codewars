import java.util.Arrays;

public class BetweenExtremes{
  public static int betweenExtremes(int[] numbers){
    Arrays.sort(numbers);
    return numbers[numbers.length - 1] - numbers[0];
  }
}