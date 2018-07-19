Factory Method Design Pattern:

The Factory Method defines an interface for creating an object but lets subclasses decide
which class to instantiate. 

The Factory Method lets a class defer instantiation to subclasses.

The Factory Method Pattern gives us a way to encapsulate (wrap data as a single unit),
the instantiations (i.e. objects) of concrete types (classes that are not abstract or interfaces).

The Factory Method selects an appropriate class from a class hierarchy based on the application
context and other factors and instantiates that class (makes an object from) and returns it as
an instance of the parent class type.

Advantages include: it allows application objects to get access to the appropriate class
instance and elimates the need for an application object to deal with class selection criteria.

