package design_patterns.abstract_factory_pattern;

public class EmployeeFactory {

  public static Employee getEmployee(EmployeeAbstractFactory factory) {
    return factory.createEmployee();
  }
}
