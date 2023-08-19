import java.lang.reflect.Constructor;

import design_patterns.sinlgeton_pattern.SingletonPattern;

public class SingletonWork {
  public static void main(String[] args) throws Exception {
    String s1 = "Hello";
    String s2 = "Hello";
    SingletonPattern singletonPattern1 = SingletonPattern.getInstance();
    SingletonPattern singletonPattern2 = SingletonPattern.getInstance();
    System.out.println(singletonPattern1.hashCode());
    System.out.println(singletonPattern2.hashCode());
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());


    Constructor<SingletonPattern> constructor = SingletonPattern.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    /*
     * now doing this we get a new object which is a problem in our code so now we
     * have to do some changes in our constructor to resolve this issue
     */
    SingletonPattern singletonPattern3 = constructor.newInstance();
    System.out.println(singletonPattern3.hashCode());

  }
}
