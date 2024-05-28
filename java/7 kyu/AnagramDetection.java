// https://www.codewars.com/kata/529eef7a9194e0cbc1000255
import java.util.Map;
import java.util.HashMap;

public class AnagramDetection {
  public static boolean isAnagram(String test, String original) {
    Map<String, Integer> testMap = new HashMap<>();
    Map<String, Integer> originalMap = new HashMap<>();
    
    for(int i = 0; i < test.length(); i++ ){
      String actualLetter = (test.charAt(i) + "").toLowerCase();
      if(testMap.containsKey(actualLetter)){
        testMap.put(actualLetter, testMap.get(actualLetter) + 1);
      }else{
        testMap.put(actualLetter, 1);
      }
    }
    for(int i = 0; i < original.length(); i ++) {
      String actualLetter = (original.charAt(i) + "").toLowerCase();
      if(originalMap.containsKey(actualLetter)){
        originalMap.put(actualLetter, originalMap.get(actualLetter) + 1);
      }else{
        originalMap.put(actualLetter, 1);
      } 
    }
    
    return originalMap.equals(testMap);
  }
}