// https://www.codewars.com/kata/5a58d46cfd56cb4e8600009d
public class HalvingSum {
  int halvingSum(int n) {
    return n == 1 ? 1 : n + halvingSum(n / 2);
  }
}