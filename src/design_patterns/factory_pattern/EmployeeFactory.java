package design_patterns.factory_pattern;

/*
 * factory design pattern
 * 
 * factory class is the class containing the methods that are useful to return a required object of other classes
 * 
 * 1. focus on creating objects rather than the implementation 
 * 2. advantage provide robust code , loose coupling
 * loosing coupling now on runtime if we change the string arguement then our object will change automatically
 * 
 */

public class EmployeeFactory {

  public static Employee getEmployee(String empType) {
    if (empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
      return new AndroidDev();
    } else if (empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
      return new WebDev();
    } else {
      return null;
    }
  }
}
