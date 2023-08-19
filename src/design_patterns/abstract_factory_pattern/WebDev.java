package design_patterns.abstract_factory_pattern;

public class WebDev implements Employee {
  @Override
  public int salary() {
    return 40000;
  }

  @Override
  public String name() {
    System.out.println("I am web developer");
    return "WEB DEVELOPER";
  }
}
