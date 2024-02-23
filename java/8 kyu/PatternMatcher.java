
// https://www.codewars.com/kata/56a3f08aa9a6cc9b75000023
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
  public static boolean validateUsr(String s) {
    Matcher matcher = Pattern.compile("[a-z0-9_]{4,16}").matcher(s);
    return matcher.matches();
  }
}
