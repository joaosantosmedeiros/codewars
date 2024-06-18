// https://www.codewars.com/kata/57f759bb664021a30300007d
public class Switch {
  public static String switcheroo(String x) {
    return x.replaceAll("[b]", "d").replaceAll("[a]", "b").replaceAll("[d]", "a");
  }
}