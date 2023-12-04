// https://www.codewars.com/kata/563b74ddd19a3ad462000054/train/java
public class StringyStrings {
  public static String stringy(int size) {
    String bits = "";

    for(int i = 1; i <= size ; i++){
      bits += i % 2 == 0 ? "0" : "1";
    }

    return bits;
  }
}