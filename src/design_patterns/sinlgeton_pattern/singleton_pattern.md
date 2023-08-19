# Singleton Design Pattern

## Intent

Ensure a class has only one instance, and provide a global point of access to it.

## Applicability

Use the singleton pattern when:

- there must be exactly one object of a particular type;
- when the sole instance should be extensible by subclassing, and clients should not be aware
  that a default instance exists;
- state is shared between many objects, and you want to avoid having to pass a lot of
  information
  via method parameters or return values. You may also need to coordinate actions across several classes that would otherwise

## Advantages

1. Ease of use - The client can get an instance of the class through its static method and does not need to create any instances.
2. Flexibility – It allows us to extend or modify the behavior of our application without changing code in other parts of the program.
3. Maintainability – We do not have to worry about creating multiple copies of classes in memory or maintaining references to them.
4. Portability – Since we are using a single copy of this class across all the applications that use it, we don’t have to worry about different versions of the same class being loaded into
   memory at runtime. This also helps with unit testing since we will always be dealing with the exact same version of the class.
5. Security – There won't be any security issues because no new instances of the class will ever be created.
6. Performance – Creating a new instance of the class takes time which may affect performance if done frequently.
