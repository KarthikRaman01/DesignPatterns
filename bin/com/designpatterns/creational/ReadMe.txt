Creational Patterns:

Most important: You are programming to an interface.

Factory Pattern
1) Creation of Objects
2) Factory methods are responsible for creation of objects.
3) Three methods - abstract creator, concrete creator, static creator

Example:

One family --> one interface --> ex: shape
child classes that implements that interface --> ex: rectangle, square etc
Factory class that is abstract --> has a factory method --> responsible for creation of right objects.








Singleton Pattern
1) Creation of only one object
2) Mostly used for database connections, file system etc.

Sometimes dependency injection is used and sometimes singleton is used.

When to use Dependency Injection?
If we need to write unit tests - very difficult to write unit tests for singleton.
With Dependency injection, we can pass the mock to the constructor.

When to use Singleton?
For certain use cases, we cannot pass the instance to the construction of all the classes.
Take for ex: Logger - Logger needs to be used in all the classes and in this case, Logger should be a singleton

Use Doublc checked locking or Bill Pugh Approach
Bill Pugh Apporach - widely used, thread safe, doesn't use synchronization, faster and only creates the instance when
the client needs it - Recommended




Builder Pattern
Useful when creating the object is complex and is independent of the 
assembly of the parts of the object

Example:
Trip Planner Object 
 ---> Hotel Reservation
 ---> Dinner Reservation
 ---> Special Event Reservation
 ---> Airline Reservation 
 ...and so on
 
Some may be present in the same city and doesn't need Hotel/Airline Reservation
Som may have to travel for this trip


In the example, we will create an object which will contain a list of strings - can be a list of other objects too
1) Builder Interface --> Vehicle Builder
Methods --> 
to build the product --> buildBody, buildHead etc
to return the product which has list of parts/objects

2) CarBuilder and BikeBuilder implements the builder
Have the product as an attribute
And in implementation of the methods, keep adding objects/strings to the product

3) Director 
Has an association relationship with the builder interface
has an construct method that constructs all the parts

4) Client
Create a object for carBuilder
Create an object for Director and pass the reference to Director
and call construct method
Now the product is ready. use carBuilder object to get the product (car product)
Product has the list of objects/strings




