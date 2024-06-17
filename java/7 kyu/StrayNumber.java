// https://www.codewars.com/kata/57f609022f4d534f05000024
import java.util.stream.IntStream;

public class StrayNumber {
  static int stray(int[] numbers) {
    for(int number : numbers) {
      if(IntStream.of(numbers).filter(n -> n == number).count() == 1){
        return number;
      }
    }
    return 0;
  }
}