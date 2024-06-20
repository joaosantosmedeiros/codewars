// https://www.codewars.com/kata/593b1909e68ff627c9000186
public class NicknameGenerator {
  public static String nickname(String name) {
    if (name.length() < 4) return "Error: Name too short";
    return (name.charAt(2) + "").matches("[aeiou]") ? name.substring(0, 4) : name.substring(0, 3);
  }
}