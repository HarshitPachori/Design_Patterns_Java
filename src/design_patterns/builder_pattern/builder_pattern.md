# Builder Design Pattern

Builder design pattern is used when we want to build complex objects without exposing their internal structure or implementation details.

The Factory and Abstract Factory Pattern not come into use when dealing with the objects having numerous arguements.

While creating object and if the object containinf many attributes then there are many problem exists.

1. We have to pass many attributes to create the object
   2.some parameters might be optional
2. factory class takes all responsibility for creating the objects, if the object is heavy then all complexity is the part of the factory class.

So we use Builder pattern and in this , we create object step by step and finally return the final object with desired attributes.
