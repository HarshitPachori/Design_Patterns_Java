package design_patterns.abstract_factory_pattern;

/*
 * this factory is for creating the object of the  manager 
 * 
 */
public class ManagerFactory extends EmployeeAbstractFactory {

  @Override
  public Employee createEmployee() {
    return new Manager();
  }

}
