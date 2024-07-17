// https://www.codewars.com/kata/5296455e4fe0cdf2e000059f/
public class Calculator {
  public static Double calculate(final double numberOne, final String operation, final double numberTwo) {
    if(operation.equals("+")) return numberOne + numberTwo;
    if(operation.equals("-")) return numberOne - numberTwo;
    if(operation.equals("*")){
      if(numberTwo == 0|| numberOne == 0) return 0d;
      return numberOne * numberTwo;
    }
    if(operation.equals("/") && numberTwo != 0) return numberOne / numberTwo;
    return null;
  }
}