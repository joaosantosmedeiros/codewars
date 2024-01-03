// https://www.codewars.com/kata/542c0f198e077084c0000c2e/train/java
public class FindDivisor {
  public long numberOfDivisors(int n) {
    long divisors = 0;

    for(int i = 1; i <= n; i++){
      if(n % i == 0){
        divisors ++;
      }
    }

    return divisors;
  }
}