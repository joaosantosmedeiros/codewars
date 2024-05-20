import java.util.Arrays;

public class GiftSorter{
  public String sortGiftCode(String code){
    String[] codeSplitted = code.split("");
    
    Arrays.sort(codeSplitted);
    
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < codeSplitted.length; i ++) {
      sb.append(codeSplitted[i]);
    }
    return sb.toString();
  }
}