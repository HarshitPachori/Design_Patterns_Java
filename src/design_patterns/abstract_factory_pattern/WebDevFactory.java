package design_patterns.abstract_factory_pattern;

public class WebDevFactory extends EmployeeAbstractFactory {

  @Override
  public Employee createEmployee() {
    return new WebDev();
  }

}
