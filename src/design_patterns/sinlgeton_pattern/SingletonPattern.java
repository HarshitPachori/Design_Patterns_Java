package design_patterns.sinlgeton_pattern;

/*
 * Singleton pattern is used when we have to only create a single  object of a class and use that object throughout the project instaed of creating separate or other objects 
 * 
 * 
 */
public class SingletonPattern {
  /*
   * for eager
   * 
   * private static SingleTonPattern instance = new SingletonPattern();
   * 
   * now this will create the instance whether a client(user) need it or not
   * 
   * public static SingletonPattern getInstance() {
   * return instance;
   * }
   * 
   */

  // for lazy
  private static SingletonPattern instance;

  private SingletonPattern() {
    /*
     * now we do certain changes in this constructor so the reflection api wiil also
     * not break the issue
     */
    if (instance != null) {
      throw new RuntimeException("you are trying to break singleton pattern");
    }
  }

  public static SingletonPattern getInstance() {
    if (instance == null) {
      {
        synchronized (SingletonPattern.class) {
          instance = new SingletonPattern();
        }
      }
    }
    return instance;
  }

  /*
   * 1. Make constructor private so that no one can create the object of that
   * class
   * 2. Now make a method that create an object only one time
   * now to make a new object we need object and to call that method we also need
   * an object so we make this method as static method
   * 
   * 3. Create a static class variable so if the object is already created than we
   * did not create a new object instead we return that object
   * 4. Now to check this is working or not go to main method and try to create
   * two objects and compare there hashcodes if they are both same object or not
   * 
   * now we find that both objects are same but there are some problems in this
   * pattern that can be breaked easily
   * now we go to our main method and use reflection api to change the constructor
   * access modifier from private to public (it also throws exception so use
   * throws exception in main class)
   * 
   * 5. add synchronized block so that it is also compatible for thread safe
   * environment
   */
}
