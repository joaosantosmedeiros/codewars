// https://www.codewars.com/kata/54ba84be607a92aa900000f1
import java.util.Map;
import java.util.HashMap;

public class isogram {
  public static boolean  isIsogram(String str) {
    str = str.toLowerCase();
    Map<Character, Integer> letters = new HashMap<>();

    for(int i = 0; i < str.length(); i ++) {
      if(letters.containsKey(str.charAt(i))){
        return false;
      }
      letters.put(str.charAt(i), null);
    }

    return true;
  } 
}