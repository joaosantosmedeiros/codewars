// https://www.codewars.com/kata/5a4d303f880385399b000001
class StrongNumber {

  public static String isStrongNumber(int num) {
    int aux = num;
    int total = 0;
    while (aux > 0) {
      int rest = aux % 10;
      total += factorial(rest);
      aux /= 10;
    }

    return total == num ? "STRONG!!!!" : "Not Strong !!";
  }

  public static int factorial(int num) {
    if (num > 0) {
      return num * factorial(num - 1);
    }
    return 1;
  }
}