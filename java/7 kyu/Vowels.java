// https://www.codewars.com/kata/54ff3102c1bad923760001f3
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowels {

  public static int getCount(String str) {
    Pattern pattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(str);
    return (int) matcher.results().count();
  }

}