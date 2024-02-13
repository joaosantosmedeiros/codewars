
// https://www.codewars.com/kata/5865918c6b569962950002a1/train/java
import java.util.Arrays;
import java.util.List;

public class AllStarCodeChallenge18 {
  public static int strCount(String str, char letter) {
    List<String> list = Arrays.asList(str.split(""));
    return (int) list.stream().filter(actualLetter -> actualLetter.equals(String.valueOf(letter))).count();
  }
}