// https://www.codewars.com/kata/54ff0d1f355cfd20e60001fc/train/java
public class Factorial {
  public int factorial(int n) {
    if(n>12 || n < 0){
      throw new IllegalArgumentException();
    }
    if(n == 0){
      return 1;
    }
    return n * factorial(n - 1);
  }
}