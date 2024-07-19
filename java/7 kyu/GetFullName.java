// https://www.codewars.com/kata/597c684822bc9388f600010f

public class GetFullName {

  private String firstName;
  private String lastName;
  
  public GetFullName(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  public String getFullName() {
    if(lastName.length() > 0 && firstName.length() > 0) return firstName + " " + lastName;
    if(lastName.length() > 0) return lastName;
    return firstName;
  }
  
}