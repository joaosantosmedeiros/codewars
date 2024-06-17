// https://www.codewars.com/kata/56541980fa08ab47a0000040
public class Printer {
  public static String printerError(String s) {
    int errors = (int) s.chars().filter(c -> c > 109).count();
    return errors + "/" + s.length();
  }
}