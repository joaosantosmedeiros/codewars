//https://www.codewars.com/kata/6507e3170b7009117e0c7865/solutions/java

public class FreedPrisoners {
    public static int freedPrisoners(Boolean[] prison) {
      int amount = 0;
      boolean t = true;
      
      if(prison == null || prison.length == 0 || prison[0] == false) return 0;
      for(int i = 0; i < prison.length; i ++) {
        if(prison[i] == t){
          amount ++;
          t = !t;
        }
      }
      
      return amount;
    }
  }