// https://www.codewars.com/kata/5effa412233ac3002a9e471d
public class SillyAdditon {

  public static int add(int num1, int num2) {
    String n1 = Integer.toString(num1);
    String n2 = Integer.toString(num2);
    if (n1.length() != n2.length()) {
      n1 = "0".repeat(Math.max(0, n2.length() - n1.length())) + n1;
      n2 = "0".repeat(Math.max(0, n1.length() - n2.length())) + n2;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n1.length(); i++) {
      sb.append((n1.charAt(i) - '0') + (n2.charAt(i) - '0'));
    }

    return Integer.parseInt(sb.toString());
  }
}