// https://www.codewars.com/kata/55c90cad4b0fe31a7200001f
public class BugFix5 {
  public static String buildString(String... args) {

    return "I like " + String.join(", ", args) + "!";
  }
}