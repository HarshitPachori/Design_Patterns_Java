# Factory Design Pattern

The factory design pattern is a creational design pattern that uses factories to deal with the problem of creating objects without having to specify their concrete classes.

It provides an interface for creating objects in a superclass, but allows subclasses to alter the creating objects. It's used when we want to create an object without exposing its implementation details.

Factory class is the class containing the methods that are useful to return a required object of other classes

- Focus on creating objects rather than the implementation.
- Provide robust code , loose coupling
  loosing coupling now on runtime if we change the string arguement then our object will change automatically.

### Advantages:

- Allows adding new implementations without modifying existing code.
- Provides better modularity by decoupling concrete implementation details from client code.
- Reduces coupling between components.
- Improves extensibility through inheritance.
