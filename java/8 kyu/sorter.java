
// https://www.codewars.com/kata/5a07e5b7ffe75fd049000051
import java.util.List;

class sorter {
  public static List<String> sort(List<String> textbooks) {
    textbooks.sort((a, b) -> a.compareToIgnoreCase(b));
    return textbooks;
  }
}