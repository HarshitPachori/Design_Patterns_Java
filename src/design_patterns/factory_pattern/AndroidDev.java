package design_patterns.factory_pattern;

public class AndroidDev implements Employee {

  @Override
  public int salary() {
    System.out.println("Getting Android developer salary : ");
    return 50000;
  }

}
