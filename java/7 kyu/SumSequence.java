// https://www.codewars.com/kata/586f6741c66d18c22800010a

public class SumSequence {
  public static int sequenceSum(int start, int end, int step) {
    int sum = 0;
    if(start > end){
      return sum;
    }
    
    while(start <= end){
      sum += start;
      start += step;
    }
    
    return sum;
  }
}