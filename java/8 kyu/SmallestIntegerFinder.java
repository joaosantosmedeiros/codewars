
// https://www.codewars.com/kata/55a2d7ebe362935a210000b2
import java.util.stream.IntStream;

public class SmallestIntegerFinder {
  public static int findSmallestInt(int[] args) {
    return IntStream.of(args).min().orElse(0);
  }

  // HARDCORE
  // public static int findSmallestInt(int[] args) {
  // if(args == null || args.length == 0){
  // return 0;
  // }
  // int min = args[0];
  // for(int i = 0; i < args.length; i ++) {
  // if(args[i] < min){
  // min = args[i];
  // }
  // }

  // return min;
  // }
}