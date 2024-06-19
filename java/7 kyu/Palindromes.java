// https://www.codewars.com/kata/525f039017c7cd0e1a000a26
public class Palindromes {
  public static int palindromeChainLength (long n) {
    int steps = 0;
    while(Long.parseLong(new StringBuilder(n + "").reverse().toString()) != n){
      n += Long.parseLong(new StringBuilder(n + "").reverse().toString());
      steps ++;
    }
    
    return steps;
  }
}
