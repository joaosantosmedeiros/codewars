// https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9

public class ShortestWord {
  public static int findShort(String s) {
    String[] words = s.split(" ");
    
    int minLength = words[0].length();
    for(int i = 0; i < words.length; i ++){
      minLength = (words[i].length() < minLength) ? words[i].length() : minLength;
    }
    
    return minLength;
  }
}