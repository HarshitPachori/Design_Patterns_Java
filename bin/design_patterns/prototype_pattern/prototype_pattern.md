# Prototype Design Pattern

The concept behind the Prototype design pattern is to copy an existing object rather than creating a new instance from scratch , because creating new object may be costly.

This approaches saves time and resources , expecially when object creation is a heavy process ( like connecting to the database , deleting or sharing files of big size over network, other netowrk conection etc).

Specify the kinds of objects to create using a prototypical instance, and create new objects by copying/cloning this prototype.

> 1.  The Client creates a clone (using the `clone()` method). This is done by creating an object that implements the same interface as the original one.
> 2.  then it calls its own constructor with all parameters needed that implements the same interface as the original one but has no state.
> 3.  Then it calls methods on that cloned object which will invoke operations in its own implementation.
