About the Decorator Pattern:
The intent of the Decorator Design Pattern is to attach additional responsibilities to an object
dynamically.
It is an alternative to sub-classing for extending functionality.
It extends the functionality of an object dynamically without having to change the original class source
or by using inheritance.
This is done by creating an object wrapper referred to as a Decorator around the actual object.

The Decorator Design Pattern looks good when you need to add extra functionality to an object without
modifying it at runtime. Resulting in lots of little objects. These objects differ only in the way
they are interconnected and not in their class or in the value of their variables.

One would use the Decorator Pattern for the following reasons:
- To add responsibilities to objects dynamically without effecting other objects.
- To remove responsbilities.
- When extension by sub-classing is impractical.