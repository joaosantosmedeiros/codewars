// https://www.codewars.com/kata/5302d846be2a9189af0001e4
public class Hello {
  public String sayHello(String[] name, String city, String state) {
    String fullName = String.join(" ", name);
    return "Hello, " + fullName + "! Welcome to " + city + ", " + state + "!";
  }
}