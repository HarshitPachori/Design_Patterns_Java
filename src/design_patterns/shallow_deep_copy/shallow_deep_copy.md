# Shallow Copy

In shallow copy, we are copying the reference of an object. It means that both variables will point to same memory
location and any changes in one variable will reflect on other also.

a = [10] # a is pointing at 4th address

b=a # b points to first address i.e., 2nd address

> Example :
>
> - Consider we have an object containing attributes like
>   - int a = 8;
>   - Student st;
>
> * now when we clone this object ( having student object inside it also ) only the reference of student object will come in the cloned object and we try to change in any of the object due to the same memory location the change in one object will also reflect in the other object.

# Deep Copy

Deep copy copies all data from source into destination. In deep copy , it creates new space for each element which contains value of original array or list . So if you change something inside copied list for each element which contains value and then assigns this newly created space as a pointer or link between two for each element inside array or dictionary . So if you change value of any item then only that particular item gets changed but not whole list/dictionary.

> Example :
>
> - Consider we have an object containing attributes like
>   - int a = 8;
>   - Student st;
>
> * now we create a copy of student object
> * and now when we clone this whole object ( having student object inside it also ) only the reference of student object will come in the cloned object and we will now point that objects student object to the newly created object .
> * if we modify the objects now then there is different memory locations or references so both have different changes without affecting each other.

To implement deep copy we have to put each value of reference object into the new object in the clone method of out prototype model class
