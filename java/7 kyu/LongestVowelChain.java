// https://www.codewars.com/kata/59c5f4e9d751df43cf000035
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestVowelChain {
  public static int solve(String s) {
    int max = 0;
    Matcher m = Pattern.compile("[aeiou]+").matcher(s);
    
    var matches = m.results().toList();
    for(var match : matches) {
      if(match.group().length() > max) max = match.group().length();
    }
    
    return max;
  }
}