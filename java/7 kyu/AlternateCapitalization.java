// https://www.codewars.com/kata/59cfc000aeb2844d16000075
public class AlternateCapitalization{
  public static String[] capitalize(String s){
    StringBuilder s1 = new StringBuilder();
    StringBuilder s2 = new StringBuilder();
    
    for(int i = 0; i < s.length(); i ++) {
      if(i % 2 == 0){
        s1.append(Character.toString(s.charAt(i)).toUpperCase());
        s2.append(Character.toString(s.charAt(i)).toLowerCase());
      }else{
        s2.append(Character.toString(s.charAt(i)).toUpperCase());
        s1.append(Character.toString(s.charAt(i)).toLowerCase());
      }   
    }
    
    return new String[]{s1.toString(), s2.toString()};
  }
}