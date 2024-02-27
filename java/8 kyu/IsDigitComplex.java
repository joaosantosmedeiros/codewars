// https://www.codewars.com/kata/57126304cdbf63c6770012bd
public class IsDigitComplex {

  public boolean isDigit(String s) {
    try {
      Double.parseDouble(s);
    } catch (Exception e) {
      return false;
    }
    return true;
  }
}
