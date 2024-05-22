// https://www.codewars.com/kata/5436f26c4e3d6c40e5000282/solutions/java

import java.util.stream.IntStream;

public class SequenceSum {
	public static int[] sumOfN(int n) {
    int[] numbers = new int[Math.abs(n) + 1];
    for(int i = 0; i < numbers.length; i ++) {
      numbers[i] = n >= 0 ? IntStream.rangeClosed(0, i).sum() : IntStream.rangeClosed(-i, 0).sum();
    }
    
    return numbers;
  }
}