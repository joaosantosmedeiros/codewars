// https://www.codewars.com/kata/56530b444e831334c0000020/
public class GenderCheck {
  public static String chromosomeCheck(String sperm) {
    String gender = sperm == "XY" ? "son" : "daughter";
    return "Contratulations! You're going to have a " + gender + ".";
  }
}