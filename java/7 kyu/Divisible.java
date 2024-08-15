// https://www.codewars.com/kata/558ee8415872565824000007
public class Divisible {
  public static boolean isDivisible(int... numbers) {
    for(int i = 1; i < numbers.length; i ++){
      if(numbers[0] % numbers[i] != 0 ) return false;
    }
    return true;
  }
}
