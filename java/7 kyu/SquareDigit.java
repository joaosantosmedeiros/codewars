// https://www.codewars.com/kata/546e2562b03326a88e000020
public class SquareDigit {

  public int squareDigits(int n) {
    String[] s = (n + "").split("");
    StringBuilder sb = new StringBuilder("");
    for(String num : s) {
      int actual = Integer.parseInt(num);
      sb.append(actual * actual);
    }

    return Integer.parseInt(sb.toString());
  }

}