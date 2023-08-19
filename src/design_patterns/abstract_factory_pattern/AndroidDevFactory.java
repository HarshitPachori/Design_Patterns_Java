package design_patterns.abstract_factory_pattern;

public class AndroidDevFactory extends EmployeeAbstractFactory {

  @Override
  public Employee createEmployee() {
    return new AndroidDev();
  }

}
