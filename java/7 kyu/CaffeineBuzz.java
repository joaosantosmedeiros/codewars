// https://www.codewars.com/kata/5434283682b0fdb0420000e6
public class CaffeineBuzz {
  public static String caffeineBuzz(int n){
    StringBuilder sb = new StringBuilder();
    int cont = 0;
    
    if(n % 3 == 0){
      if(n % 4 == 0) sb.append("Coffee");
      else sb.append("Java");
      cont ++;
    }
    
    if(cont > 0) return n % 2 == 0 ? sb.append("Script").toString() : sb.toString();
        
    return "mocha_missing!";
  }
}