
// https://www.codewars.com/kata/5b077ebdaf15be5c7f000077
import java.util.stream.IntStream;

class CountSheep {
  public static String countingSheep(int num) {
    return String.join("", IntStream.rangeClosed(1, num).boxed().map(n -> String.valueOf(n + "sheep...")).toList());
  }
}