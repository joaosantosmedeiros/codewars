// https://www.codewars.com/kata/6411b91a5e71b915d237332d
public class ValidParentheses {

  public static boolean validParentheses(String parenStr) {
    StringBuilder sb = new StringBuilder(parenStr);
    while (sb.indexOf("(") >= 0 && sb.indexOf(")") >= 1) {
      sb.deleteCharAt(sb.indexOf("("));
      sb.deleteCharAt(sb.indexOf(")"));
    }

    return sb.length() == 0;
  }
}
