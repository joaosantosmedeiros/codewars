// https://www.codewars.com/kata/5412509bd436bd33920011bc/train/java
public class Maskify {
  public static String maskify(String str) {
      if(str.length() > 4){
        String firstDigits = str.substring(0, str.length() - 4).replaceAll(".", "#");
        String lastFour = str.substring(str.length() - 4, str.length());
        return firstDigits + lastFour;
      }
      return str;
    }
}