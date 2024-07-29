// https://www.codewars.com/kata/55960bbb182094bc4800007b

public class InsertDash {
  public static String insertDash(int num) {
    StringBuilder sb = new StringBuilder(Integer.toString(num));
    for(int i = 0; i < sb.length() - 1; i ++){
      int actualChar = Integer.parseInt(Character.toString(sb.charAt(i)));
      int nextChar = Integer.parseInt(Character.toString(sb.charAt(i + 1)));
      if(actualChar % 2 != 0 && nextChar % 2 != 0){
        sb.insert(i + 1, "-");
        i ++;
      }
    }
    return sb.toString();
  }
}