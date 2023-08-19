import design_patterns.abstract_factory_pattern.AndroidDevFactory;
import design_patterns.abstract_factory_pattern.Employee;
import design_patterns.abstract_factory_pattern.EmployeeFactory;
import design_patterns.abstract_factory_pattern.ManagerFactory;
import design_patterns.abstract_factory_pattern.WebDevFactory;

public class AbstractFactoryClient {
  public static void main(String[] args) {

    /*
     * now the client does not know from where the object is created thus the object
     * creation logic is being hide from the client
     * and also he employee factory also not know where the object is created
     * 
     * A(makes req for something) -> B (makes request for something) -> C and D
     * (fullfills the request of B and send result back to B then B sends the result
     * back to A)
     * 
     */
    Employee employee1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
    Employee employee2 = EmployeeFactory.getEmployee(new WebDevFactory());
    Employee employee3 = EmployeeFactory.getEmployee(new ManagerFactory());
    employee1.name();
    employee2.name();
    employee3.name();
  }
}
