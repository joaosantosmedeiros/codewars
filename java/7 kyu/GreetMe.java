// https://www.codewars.com/kata/535474308bb336c9980006f2
public class GreetMe {
  public static String greet(String name) {
    return "Hello " + Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase() + "!";
  }
}