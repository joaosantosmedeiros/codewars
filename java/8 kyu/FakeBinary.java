// https://www.codewars.com/kata/57eae65a4321032ce000002d
public class FakeBinary {
  public static String fakeBin(String numberString) {
    return numberString.replaceAll("[2-4]", "0").replaceAll("[5-9]", "1");
  }
}
