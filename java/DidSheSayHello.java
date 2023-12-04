// https://www.codewars.com/kata/56a4addbfd4a55694100001f/train/java
public class DidSheSayHello{
  public static boolean validateHello(String greetings){
    greetings = greetings.toLowerCase();
    return greetings.contains("hello") || greetings.contains("ciao") || greetings.contains("salut") || greetings.contains("hallo") || greetings.contains("hola") || greetings.contains("ahoj") || greetings.contains("czesc");
    }  
}
