# Abstract Factory Design Pattern

In this design pattern we create factory class and also different abstract factory classes.
This Design pattern provides or adds one more layer of abstraction and thus provide more flexibilty and stability to our code.

> - It is similar to the Factory Design Pattern.
> - It provides the concept Factory of Factories.

Example ->

- now the client does not know from where the object is created thus the object.
- creation logic is being hide from the client.
- and factory class also not know anything about how the object is created.

- A(makes req for something) -> B (makes request for something) -> C and D
  (fullfills the request of B and send result back to B then B sends the result
  back to A)
