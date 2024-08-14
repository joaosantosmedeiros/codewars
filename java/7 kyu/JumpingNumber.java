// https://www.codewars.com/kata/5a54e796b3bfa8932c0000ed
public class JumpingNumber{
  public static String jumpingNumber(int number){
    int[] digits = (number + "").chars().map(ch -> ch - '0').toArray();
    for(int i = 0; i < digits.length - 1; i ++) {
      if(Math.abs(digits[i] - digits[i + 1]) != 1) return "Not!!";
    }
    return "Jumping!!";
  }
}