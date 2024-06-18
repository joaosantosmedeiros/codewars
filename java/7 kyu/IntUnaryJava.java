// https://www.codewars.com/kata/538835ae443aae6e03000547
import java.util.function.IntUnaryOperator;

public class IntUnaryJava {

  public static IntUnaryOperator add(int n) {
    return (x) -> n + x;
  }

}