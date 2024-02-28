// https://www.codewars.com/kata/56efc695740d30f963000557/
public class StringUtilsAlternatingCase {

  public static String toAlternativeString(String string) {
    StringBuilder sb = new StringBuilder();
    string.codePoints()
        .map(code -> code >= 97 && code <= 122 ? code - 32 : code >= 65 && code <= 90 ? code + 32 : code)
        .forEach(code -> {
          sb.append(Character.toString(Character.toChars(code)[0]));
        });

    return sb.toString();
  }
}