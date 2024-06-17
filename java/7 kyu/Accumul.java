// https://www.codewars.com/kata/5667e8f4e3f572a8f2000039

public class Accumul {
  public static String accum(String s) {
   String[] letters = s.split("");
   for(int i = 0; i < s.length(); i ++) {
    letters[i] = letters[i].toUpperCase() + letters[i].toLowerCase().repeat(i);
   }

   return String.join("-", letters);
  }
}