// https://www.codewars.com/kata/57f222ce69e09c3630000212
import java.util.Arrays;

public class WellOfIdeas {
  public static String well(String[] x) {
    long occurrences = Arrays.stream(x).filter(str -> str == "good").count();
    if (occurrences > 2) {
      return "I smell a series!";
    }
    if (occurrences > 0) {
      return "Publish!";
    }

    return "Fail!";
  }

}