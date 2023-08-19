package design_patterns.factory_pattern;

public class WebDev implements Employee {

  @Override
  public int salary() {
    System.out.println("Getting Web developer salary : ");
    return 40000;
  }
}
