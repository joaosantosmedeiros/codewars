// https://www.codewars.com/kata/5a4e3782880385ba68000018

import java.util.Arrays;

public class BalancedNumbers{
  public static String balancedNum(long number){
    if(number < 100) {
      return "Balanced";
    }
        
    String stringfiedNumber = String.valueOf(number);
    boolean isEven = stringfiedNumber.length() % 2 == 0;
    String firstHalf = stringfiedNumber.substring(0, stringfiedNumber.length() / 2 - ( isEven ? 1 : 0));
    String secondHalf = stringfiedNumber.substring(stringfiedNumber.length() / 2 + 1);
    
    int firstSum = Arrays.stream(firstHalf.split("")).mapToInt(i -> Integer.parseInt(i)).sum();
    int secondSum = Arrays.stream(secondHalf.split("")).mapToInt(i -> Integer.parseInt(i)).sum();
    return firstSum == secondSum ? "Balanced" : "Not Balanced";
  }
}