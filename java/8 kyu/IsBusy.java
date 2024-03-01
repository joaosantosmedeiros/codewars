
// https://www.codewars.com/kata/54fdaa4a50f167b5c000005f
import java.util.HashMap;

public class IsBusy {

  public static HashMap<String, String> getStatus(boolean isBusy) {
    HashMap<String, String> status = new HashMap<>();

    if (isBusy) {
      status.put("status", "busy");
    } else {
      status.put("status", "available");
    }

    return status;
  }

}