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


