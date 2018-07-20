Visitor Pattern:

The Visitor pattern is useful when designing an operation across a diverse collection of
objects of a class hierarchy. 
It allows the operation to be defined without changing the class of any of the objects in the
collection. 
To do this, the visitor pattern suggests defining an operation in a separate class referred
to as a visitor class. For every new operation that is to be defined, a new visitor class
is created. 
Also, since the operation is to be performed across a set of objects, the visitor class needs
a way of accessing the public members of these objects.

Implementing the Visitor Pattern requires two important interfaces: 
An Element interface that contains an accept method with an argument of type Visitor. This
interface will be implemented by all classes that need to allow visitors to visit them.
The other important interface is the Visitor interface. This will contain visit methods
with an argument of a class that implements the Element interface. 

When to use the Visitor Design Pattern:
- When an object structure contains many classes of objects with differing interfaces and
  you want to perform operations on these objects depending on their concrete classes.
- Many distinct and unrelating operations need to be performed on objects in an object
  structure and you want to avoid "polluting" their classes with these operations.
- When the classes defining the object structure rarely change but you want to define new
  operations over the structure.