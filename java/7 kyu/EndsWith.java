// https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d
public class EndsWith {
  public static boolean solution(String str, String ending) {
    if(ending.length() > str.length()){
      return false;
    }
    int endLength = ending.length();
    
    for(int i = 0; i < endLength; i ++){
      if(ending.charAt(i) != str.charAt(str.length() - (endLength - i))){
        return false;
      }
    }
    return true;
  }
}