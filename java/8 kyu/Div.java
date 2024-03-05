// https://codewars.com/kata/5a2fd38b55519ed98f0000ce
class Div {
  public static String multiTable(int num) {
    StringBuilder sb = new StringBuilder();

    for (int i = 1; i <= 10; i++) {
      sb.append(i + " * " + num + " = " + num * i + "\n");
    }

    return sb.substring(0, sb.length() - 1);
  }
}