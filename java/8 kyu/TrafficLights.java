// https://www.codewars.com/kata/58649884a1659ed6cb000072/train/java
import java.util.List;

public class TrafficLights {

  public static String updateLight(String current) {
    List<String> lights = List.of("green", "yellow", "red", "green");
    int index = lights.indexOf(current);
    
    return lights.get(index + 1);
  }
}