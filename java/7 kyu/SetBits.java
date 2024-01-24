// https://www.codewars.com/kata/5a0d38c9697598b67a000041/train/java
public class SetBits {
  public static long eliminateUnsetBits(String number) {
    String replacedNumber = number.replace("0", "");
    return replacedNumber.isEmpty() ? 0 : Long.parseLong(replacedNumber, 2) ;
  }
}