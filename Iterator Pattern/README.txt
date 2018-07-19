Iterator Pattern:

Aggregate Object:
If you have a class called 'Address' which contains information about an address
and you have a class called 'Employee' that contains an object of type 'Address'.
Then you can say the 'Employee HAS-A Address'.

An aggregate object, such as a list, should give you access to its elements without exposing
its internal structure.
Also, you may want to traverse the list depending on what you want.
However, you do not want the list interface to bloat with different operations on traversals,
even if you can anticipate the ones you need.

The iterator pattern lets you do this. The key idea is to take the responsibility for accessing
and traversalling out of the list object and put it into a separate iterator object. 
The Iterator class defines an interface for accessing the list's elements. We can create an
iterator object and it will be responsible for keeping track of the current element and know
which elements have been already traversed.

The intent of the iterator design pattern is to provide a way to access the elements of an 
aggregate object sequentially without exposing its underlying representation.

It allows a client object to access the contents of a container in a sequential manner. Without
knowing the internal representation of its contents.
Container refers to a collection of data or objects. The objects within a container could be
turned into collections themselves, thus being a collection of collections.

To do this, the Iterator pattern suggests that a Container object should be designed to provide
a public interface in the form of an Iterator object for different client objects to access its
contents. 
An iterator object contains public methods to allow a clinet object to navigate through a list
of objects within a container.
