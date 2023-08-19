
import design_patterns.factory_pattern.Employee;
import design_patterns.factory_pattern.EmployeeFactory;

public class DeveloperClient {

  public static void main(String[] args) {
    // Employee employee = new AndroidDev();
    /*
     * now client has to create the object by itself and it is als tightly coupled
     * and thus we now create a class as EmployeeFactory which will create the required object and provide to the client
     */

    Employee employee1 = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
    Employee employee2 = EmployeeFactory.getEmployee("WEB DEVELOPER");

    System.out.println(employee1.salary());
    System.out.println(employee2.salary());

  }
}
