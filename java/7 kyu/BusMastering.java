// https://www.codewars.com/kata/5a0366f12b651dbfa300000c/train/java
public class BusMastering {
  public static String arbitrate(String input, int n){
    int index = input.indexOf("1");

    if(index == -1){
      return input;
    }

    String a = input.substring(0, index + 1);
    String b = input.substring(index + 1).replace("1", "0");

    return a.concat(b);    
  }
}