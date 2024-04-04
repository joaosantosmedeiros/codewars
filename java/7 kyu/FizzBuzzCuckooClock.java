// https://www.codewars.com/kata/58485a43d750d23bad0000e6/solutions/java
import java.util.Arrays;

public class FizzBuzzCuckooClock {
  public static String fizzBuzzCuckooClock(String time) {
    int[] timeSplitted = Arrays.stream(time.split(":")).mapToInt(t -> Integer.parseInt(t)).toArray();
    int hours = timeSplitted[0];
    int minutes = timeSplitted[1];

    if (minutes == 0) {
      int repeat = hours == 0 || hours == 12 ? 12 : hours % 12;
      return "Cuckoo ".repeat(repeat).trim();
    }
    if (minutes == 30) {
      return "Cuckoo";
    }
    if (minutes % 15 == 0) {
      return "Fizz Buzz";
    }
    if (minutes % 5 == 0) {
      return "Buzz";
    }
    if (minutes % 3 == 0) {
      return "Fizz";
    }

    return "tick";
  }
}
