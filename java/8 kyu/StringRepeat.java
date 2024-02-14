// https://www.codewars.com/kata/57a0e5c372292dd76d000d7e
public class StringRepeat {
  public static String repeatStr(final int repeat, final String string) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < repeat; i++) {
      sb.append(string);
    }

    return sb.toString();
  }
}
