Prototype Pattern:

In OOP, you need objects to work with and interact with each other to complete a task.
However, creating a heavy object could become costly, especially if your application needs
many kinds of that object, thus causing performance issues.

Example: say we have an application that requires some access control. The features of the
application can be used by users according to the access rights given to them.
Some users can access reports in the app, while others cannot.
Some can modify reports, while others cannot.
Some have administrative rights to add or remove users while others do not.

Every user has an access control object which is used to provide or restrict the controls
of the application. Access control objects are generally bulky, heavy and costly since it 
requires data to be fetched from some external resource, such as a database.

We cannot share the same access control object with users of the same level because the
rights of one user could be changed at runtime.
A resolution to this is to use the Prototype Design Pattern by creating the access control
objects on all levels at once and provide a copy of an object to a user whenever required.
This means data fetching only occurs once, an access control object is not created from
scratch everytime and an access control object is created by copying an existing one. Reducing
object creation time.

The prototype design pattern has a concept of copying an existing object rather than creating
a new instance from scratch, which can be costly. The original object acts as a prototype
and contains the state of the object. A newly copied object may change some properties if
required. This saves resources and time.

When to use the Prototype Pattern:
- When a system should be independent of how its products are created, composed and
  represented.
- When the classes to instantiate are specified at run-time
- To avoid building a class hierarchy of factories that parallels the class hierarchly of
  products.



