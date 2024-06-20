// https://www.codewars.com/kata/57a62154cf1fa5b25200031e
import java.util.stream.Collectors;

public class AlternateCase {
  static String alternateCase(final String string) {
    return string.chars()
        .map(ch -> Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch))
        .mapToObj(ch -> Character.toString(ch)).collect(Collectors.joining(""));
  }
}