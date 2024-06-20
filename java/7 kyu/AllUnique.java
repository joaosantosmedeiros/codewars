// https://www.codewars.com/kata/553e8b195b853c6db4000048
public class AllUnique {
  public static boolean hasUniqueChars(String str) {
    int[] chars = str.chars().toArray();
    for (int ch : chars){
      if(str.chars().filter(c -> c == ch).count() > 1) return false;
    }
    
    return true;
  }
}