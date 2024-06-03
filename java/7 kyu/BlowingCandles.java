// https://www.codewars.com/kata/6630da20f925eb3007c5a498

import java.util.Arrays;

class BlowingCandles {
  public static int blowCandles(String str) {
    if(str.trim().length() <= 0){
      return 0;
    }
    
    int blows = 0;
    int[] candles = Arrays.stream(str.split("")).mapToInt(n -> Integer.parseInt(n)).toArray();
    
    int index = 0;
    while(!Arrays.stream(candles).allMatch(number -> number <= 0)){
      while(candles[index] <= 0){
        index ++;
      }
      candles[index] = candles[index] - 1;
      for(int i = 1; i <= 2; i ++){
        if((index + i) < candles.length && candles[index + i] > 0){
          candles[index + i] = candles[index + i] - 1;
        }
      }
      blows ++;
    }
    
    return blows;
  }
}