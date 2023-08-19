package design_patterns.abstract_factory_pattern;

public class AndroidDev implements Employee {

  @Override
  public int salary() {
    return 50000;
  }

  @Override
  public String name() {
    System.out.println("I am Android developer");
    return "ANDROID DEVELOPER";
  }

}
