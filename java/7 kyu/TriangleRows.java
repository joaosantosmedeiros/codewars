// https://www.codewars.com/kata/5a25ac6ac5e284cfbe000111/
public class TriangleRows {

  public static char triangle(final String row) {
    String str = row;
    while(str.length() > 1){
      StringBuilder sb = new StringBuilder();
      char[] chars = str.toCharArray();
      for(int i = 0; i < chars.length - 1; i ++){
        String portion = chars[i] == chars[i + 1] ? chars[i] + "" : chars[i] + "" + chars[i + 1];
        if(portion.matches("(BG)|(GB)")) portion = "R";
        if(portion.matches("(RG)|(GR)")) portion = "B";
        if(portion.matches("(RB)|(BR)")) portion = "G";
        sb.append(portion);
      }
      str = sb.toString();
    }

    return str.charAt(0);
  }  
}