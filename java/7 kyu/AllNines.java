// https://www.codewars.com/kata/664b9dd610985cc3b6784111

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AllNines {
    public static BigInteger allNines(BigInteger x) {
      List<Integer> primeNumbers = new ArrayList<>();
      int intValue = x.intValue();
      if(intValue % 2 == 0 || intValue % 5 == 0){
        return new BigInteger("-1");
      }
        
      for(int i = 2; i < 4000; i ++ ){
        int cont = 0;
        for(int j = 2; j < Math.sqrt(i); j ++) {
          if(i % j == 0){
            cont ++;
          }
        }
        if(cont <= 0){
          primeNumbers.add(i);
        }
      }

      boolean divisibleByPrime = false;
      for(int i = 0; i < primeNumbers.size(); i ++) {
        if(intValue % primeNumbers.get(i) == 0 ){
          divisibleByPrime = true;
        }
      }
      
      if(divisibleByPrime || intValue == 1){
        for(BigInteger i = new BigInteger("1") ;; i = i.add(new BigInteger("1"))){
          BigInteger nine = new BigInteger("9".repeat(i.intValue()));
          if(nine.mod(new BigInteger(intValue + "")).equals(BigInteger.ZERO)){
            return nine.divide(new BigInteger(intValue + ""));
          }
        }
      }

      return new BigInteger("-1");
    }
}