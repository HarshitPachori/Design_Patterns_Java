package design_patterns.abstract_factory_pattern;

/*
 * this approach aur design pattern provides or adds one more layer of abstraction and thus provide more flexibilty and stability to our code
 * It is similar to the factory design pattern 
 * It provides the concept factory of factories
 */
abstract public class EmployeeAbstractFactory {
  public abstract Employee createEmployee();
}
