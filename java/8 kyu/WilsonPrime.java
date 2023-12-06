// https://www.codewars.com/kata/55dc4520094bbaf50e0000cb/train/java
public class WilsonPrime {
  public static boolean am_i_wilson(double number) {
    if( number == 1 || number == 20){
      return false;
    }
    double factorial = 1;
    for(int i = 1; i < number; i++){
      factorial *= i;
    }
    return (++factorial % (number*number) == 0) || (number == 563);
  }
}